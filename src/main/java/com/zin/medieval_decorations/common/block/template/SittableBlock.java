package com.zin.medieval_decorations.common.block.template;

import java.util.List;

import com.zin.medieval_decorations.common.entity.SittableEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class SittableBlock extends Block implements SimpleWaterloggedBlock {
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public SittableBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(WATERLOGGED, Boolean.valueOf(false)));
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(WATERLOGGED);
	}
	
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
		return this.defaultBlockState()
				.setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);

	}
	
	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}
	
	@Override
	@SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

	public float seatHeight() {
		return 0.25F;
	}

	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand,
			BlockHitResult hit) {

		if (player.isPassenger() || player.isCrouching())
			return InteractionResult.PASS;

		if (!level.getBlockState(pos.above()).getCollisionShape(level, pos).isEmpty())
			return InteractionResult.PASS;

		Vec3 vec = new Vec3(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
		double maxDist = 3;
		if ((vec.x - player.getX()) * (vec.x - player.getX()) + (vec.y - player.getY()) * (vec.y - player.getY())
				+ (vec.z - player.getZ()) * (vec.z - player.getZ()) > maxDist * maxDist)
			return InteractionResult.PASS;

		ItemStack stack1 = player.getMainHandItem();
		ItemStack stack2 = player.getOffhandItem();
		if (!stack1.isEmpty() || !stack2.isEmpty())
			return InteractionResult.PASS;

		List<SittableEntity> seats = level.getEntitiesOfClass(SittableEntity.class, new AABB(pos, pos.offset(1, 1, 1)));
		if (seats.isEmpty()) {
			SittableEntity seat = new SittableEntity(level, pos, this.seatHeight());
			level.addFreshEntity(seat);
			player.startRiding(seat);
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}

}
