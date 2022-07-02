package com.zin.medieval_decorations.common.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;

public class StatueHoldingCandle extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final EnumProperty<DoubleBlockHalf> DOUBLE = BlockStateProperties.DOUBLE_BLOCK_HALF;
	
	public StatueHoldingCandle(Properties properties) {
		super(properties.lightLevel(state -> {
			return state.getValue(LIT) ? 10 : 0;
		}));
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(DOUBLE, DoubleBlockHalf.LOWER)
				.setValue(WATERLOGGED, false)
				.setValue(LIT, true)
                .setValue(FACING, Direction.NORTH));
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED, LIT, FACING, DOUBLE);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult result) {
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
	public void animateTick(BlockState facingState, Level worldIn, BlockPos pPos, Random pRandom) {
	    if (facingState.getValue(LIT)) {
		double d0 = (double) pPos.getX() + 0.5D;
		double d1 = (double) pPos.getY() + 0.7D;
		double d2 = (double) pPos.getZ() + 0.5D;
		worldIn.addParticle(ParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
	    }
	}
	
	@Override
    public boolean placeLiquid(LevelAccessor worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        if (!state.getValue(BlockStateProperties.WATERLOGGED) && fluidStateIn.getType() == Fluids.WATER) {
            boolean flag = state.getValue(LIT);
            if (flag) {
                worldIn.playSound((Player) null, pos, SoundEvents.CANDLE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            worldIn.setBlock(pos, state.setValue(WATERLOGGED, Boolean.TRUE).setValue(LIT, false), 3);
            worldIn.scheduleTick(pos, fluidStateIn.getType(), fluidStateIn.getType().getTickDelay(worldIn));
            return true;
        } else {
            return false;
        }
    }
		
	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		BlockPos blockpos = pContext.getClickedPos();
		Level level = pContext.getLevel();
		FluidState fluidState = pContext.getLevel().getFluidState(pContext.getClickedPos());
		if (blockpos.getY() < level.getMaxBuildHeight() - 1
				&& level.getBlockState(blockpos.above()).canBeReplaced(pContext)) {
			return this.defaultBlockState()
					.setValue(DOUBLE, DoubleBlockHalf.LOWER)
					.setValue(FACING, pContext.getHorizontalDirection())
					.setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);

		} else {
			return null;
		}
	}
	
	@Override
	public BlockState rotate(BlockState state, LevelAccessor world, BlockPos pos, Rotation rotation) {
		return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
	}

	@Override
	@SuppressWarnings("deprecation")
	public BlockState mirror(BlockState state, Mirror mirror) {
		return state.rotate(mirror.getRotation(state.getValue(FACING)));
	}

	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
		DoubleBlockHalf doubleblockhalf = stateIn.getValue(DOUBLE);
		if (stateIn.getValue(WATERLOGGED)) {
			worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
		}
		if (facing.getAxis() == Direction.Axis.Y
				&& doubleblockhalf == DoubleBlockHalf.LOWER == (facing == Direction.UP)) {
			return facingState.is(this) && facingState.getValue(DOUBLE) != doubleblockhalf
					? facingState.setValue(FACING, facingState.getValue(FACING))
					: Blocks.AIR.defaultBlockState();
		} else {
			return doubleblockhalf == DoubleBlockHalf.LOWER && facing == Direction.DOWN
					&& !facingState.canSurvive(worldIn, currentPos) ? Blocks.AIR.defaultBlockState()
							: super.updateShape(facingState, facing, facingState, worldIn, currentPos, facingPos);
		}

	}
	
	public static void preventCreativeDropFromBottomPart(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
	      DoubleBlockHalf doubleblockhalf = pState.getValue(DOUBLE);
	      if (doubleblockhalf == DoubleBlockHalf.UPPER) {
	         BlockPos blockpos = pPos.below();
	         BlockState blockstate = pLevel.getBlockState(blockpos);
	         if (blockstate.is(pState.getBlock()) && blockstate.getValue(DOUBLE) == DoubleBlockHalf.LOWER) {
	            BlockState blockstate1 = blockstate.hasProperty(BlockStateProperties.WATERLOGGED) && blockstate.getValue(BlockStateProperties.WATERLOGGED) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
	            pLevel.setBlock(blockpos, blockstate1, 35);
	            pLevel.levelEvent(pPlayer, 2001, blockpos, Block.getId(blockstate));
	         }
	      }

	   }
	
	@Override
	public void playerWillDestroy(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
	      if (!pLevel.isClientSide && pPlayer.isCreative()) {
	         preventCreativeDropFromBottomPart(pLevel, pPos, pState, pPlayer);
		}
		super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
	}
	
	@Override
	public long getSeed(BlockState pState, BlockPos pPos) {
	      return Mth.getSeed(pPos.getX(), pPos.below(pState.getValue(DOUBLE) == DoubleBlockHalf.LOWER ? 0 : 1).getY(), pPos.getZ());
	}
	
	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
			BlockPos blockpos = pPos.below();
			BlockState blockstate = pLevel.getBlockState(blockpos);
			return pState.getValue(DOUBLE) == DoubleBlockHalf.LOWER ? blockstate.isFaceSturdy(pLevel, blockpos, Direction.UP) : blockstate.is(this);
	}

	@Override
	public boolean isPathfindable(BlockState facingState, BlockGetter worldIn, BlockPos pPos, PathComputationType pType) {
		return false;
	}
	
	

}
