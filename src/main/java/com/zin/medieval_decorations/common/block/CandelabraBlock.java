package com.zin.medieval_decorations.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CandelabraBlock extends Block implements SimpleWaterloggedBlock {
	protected static final VoxelShape SHAPE_FLOOR = Block.box(5, 0, 5, 11, 14, 11);
	protected static final VoxelShape SHAPE_WALL_NORTH = Block.box(5, 0, 11, 11, 14, 16);
	protected static final VoxelShape SHAPE_WALL_SOUTH = Block.box(5, 0, 0, 11, 14, 5);
	protected static final VoxelShape SHAPE_WALL_WEST = Block.box(11, 0, 5, 16, 14, 11);
	protected static final VoxelShape SHAPE_WALL_EAST = Block.box(0, 0, 5, 5, 14, 11);
	protected static final VoxelShape SHAPE_CEILING = Block.box(5, 3, 5, 11, 16, 11);

	public static final EnumProperty<AttachFace> FACE = BlockStateProperties.ATTACH_FACE;
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public CandelabraBlock(Properties properties) {
		super(properties.lightLevel(state -> {
			return state.getValue(LIT) ? 10 : 0;
		}));
		this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false).setValue(LIT, true)
				.setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.FLOOR));
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED, LIT, FACE, FACING);
	}

	@Override
	@SuppressWarnings("deprecation")
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult result) {
		ItemStack heldItem = player.getItemInHand(handIn);
		if (!worldIn.isClientSide()) {
			if (heldItem.getItem() == Items.FLINT_AND_STEEL) {
				SoundEvent sound = SoundEvents.FLINTANDSTEEL_USE;
				worldIn.playSound(null, pos, sound, SoundSource.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.4F + 0.8F);

				worldIn.setBlockAndUpdate(pos, state.setValue(LIT, true));
				return InteractionResult.CONSUME;
			}
		}

		return super.use(state, worldIn, pos, player, handIn, result);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		for (Direction direction : context.getNearestLookingDirections()) {
			BlockState blockstate;
			if (direction.getAxis() == Direction.Axis.Y) {
				blockstate = this.defaultBlockState()
						.setValue(FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR)
						.setValue(FACING, context.getHorizontalDirection());
			} else {
				blockstate = this.defaultBlockState().setValue(FACE, AttachFace.WALL).setValue(FACING,
						direction.getOpposite());
			}

			if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
				return blockstate.setValue(WATERLOGGED, flag).setValue(LIT, !flag);
			}
		}
		return null;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACE)) {
		case FLOOR -> SHAPE_FLOOR;
		case WALL -> switch (state.getValue(FACING)) {
			default -> SHAPE_WALL_NORTH;
			case SOUTH -> SHAPE_WALL_SOUTH;
			case WEST -> SHAPE_WALL_WEST;
			case EAST -> SHAPE_WALL_EAST;
			};
		case CEILING -> SHAPE_CEILING;
		};
	}

	public static boolean isSupportingCeiling(BlockState facingState, BlockPos pos, LevelReader world) {
		facingState.getBlock();
		return canSupportCenter(world, pos, Direction.DOWN);
	}

	public static boolean isSupportingCeiling(BlockPos pos, LevelReader world) {
		return isSupportingCeiling(world.getBlockState(pos), pos, world);
	}

	public static boolean isSideSolidForDirection(LevelReader reader, BlockPos pos, Direction direction) {
		BlockPos blockpos = pos.relative(direction);
		return reader.getBlockState(blockpos).isFaceSturdy(reader, blockpos, direction.getOpposite());
	}

	@Override
	public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
		if (state.getValue(FACE) == AttachFace.FLOOR) {
			return canSupportCenter(worldIn, pos.below(), Direction.UP);
		} else if (state.getValue(FACE) == AttachFace.CEILING) {
			return isSupportingCeiling(pos.above(), worldIn);
		}
		return isSideSolidForDirection(worldIn, pos, state.getValue(FACING).getOpposite());
	}

	@Override
	public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
		if (!stateIn.getValue(LIT))
			return;
		Direction dir1 = stateIn.getValue(FACING);
		double xm, ym, zm, xl, yl, zl, xr, zr;
		Direction dir = dir1.getClockWise();
		double xOff = dir.getStepX() * 0.3125D;
		double zOff = dir.getStepZ() * 0.3125D;
		switch (stateIn.getValue(FACE)) {
		default -> {
			xm = pos.getX() + 0.5D;
			ym = pos.getY() + 1D;
			zm = pos.getZ() + 0.5D;
			xl = pos.getX() + 0.5D - xOff;
			yl = pos.getY() + 0.9375D;
			zl = pos.getZ() + 0.5D - zOff;
			xr = pos.getX() + 0.5D + xOff;
			zr = pos.getZ() + 0.5D + zOff;
		}
		case WALL -> {
			double xo1 = -dir1.getStepX() * 0.3125;
			double zo2 = -dir1.getStepZ() * 0.3125;
			xm = pos.getX() + 0.5D + xo1;
			ym = pos.getY() + 1;
			zm = pos.getZ() + 0.5D + zo2;
			xl = pos.getX() + 0.5D + xo1 - xOff;
			yl = pos.getY() + 0.9375;
			zl = pos.getZ() + 0.5D + zo2 - zOff;
			xr = pos.getX() + 0.5D + xo1 + xOff;
			zr = pos.getZ() + 0.5D + zo2 + zOff;
		}
		case CEILING -> {
			xm = pos.getX() + 0.5D + zOff;
			zm = pos.getZ() + 0.5D - xOff;
			ym = pos.getY() + 0.875;

			xl = pos.getX() + 0.5D + xOff;
			zl = pos.getZ() + 0.5D + zOff;
			xr = pos.getX() + 0.5D - zOff;
			zr = pos.getZ() + 0.5D + xOff;
			yl = pos.getY() + 0.8125;
			double xs = pos.getX() + 0.5D - xOff;
			double zs = pos.getZ() + 0.5D - zOff;
			double ys = pos.getY() + 0.75;
			worldIn.addParticle(ParticleTypes.FLAME, xs, ys, zs, 0, 0, 0);
		}
		}
		worldIn.addParticle(ParticleTypes.FLAME, xm, ym, zm, 0, 0, 0);
		worldIn.addParticle(ParticleTypes.FLAME, xl, yl, zl, 0, 0, 0);
		worldIn.addParticle(ParticleTypes.FLAME, xr, yl, zr, 0, 0, 0);

	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@Override
	@SuppressWarnings("deprecation")
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	@SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn,
			BlockPos currentPos, BlockPos facingPos) {
		return getFacing(stateIn).getOpposite() == facing && !stateIn.canSurvive(worldIn, currentPos)
				? Blocks.AIR.defaultBlockState()
				: super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	protected static Direction getFacing(BlockState state) {
		return switch (state.getValue(FACE)) {
		case CEILING -> Direction.DOWN;
		case FLOOR -> Direction.UP;
		default -> state.getValue(FACING);
		};
	}

	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}

	@Override
	public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {
		return false;
	}
}
