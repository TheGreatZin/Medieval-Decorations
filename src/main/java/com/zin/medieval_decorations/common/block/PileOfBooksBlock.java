package com.zin.medieval_decorations.common.block;

import com.zin.medieval_decorations.common.block.template.FlammableBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PileOfBooksBlock extends FlammableBlock implements SimpleWaterloggedBlock {
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	
	public static final int MAX_STACK = 2;
	public static final IntegerProperty BOOKS = IntegerProperty.create("books", 1, 2);
	public static final VoxelShape ONE = Block.box(2, 0, 2, 14, 9, 14);
	protected static final VoxelShape TWO = Block.box(2, 0, 2, 14, 16, 14);

	public PileOfBooksBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState()
				.setValue(FACING, Direction.NORTH)
				.setValue(BOOKS, Integer.valueOf(1))
				.setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
		switch (state.getValue(BOOKS)) {
		case 1:
		default:
			return ONE;
		case 2:
			return TWO;
		}
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(FACING, BOOKS, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos());
		if (blockstate.is(this)) {
			return blockstate.setValue(BOOKS, Integer.valueOf(Math.min(4, blockstate.getValue(BOOKS) + 1)));
		} else {
			FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
			boolean flag = fluidstate.getType() == Fluids.WATER;
			return super.getStateForPlacement(context)
					.setValue(FACING, context.getHorizontalDirection().getOpposite())
					.setValue(WATERLOGGED, Boolean.valueOf(flag));
		}
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
		return !pUseContext.isSecondaryUseActive() && pUseContext.getItemInHand().is(this.asItem())
				&& pState.getValue(BOOKS) < 2 ? true : super.canBeReplaced(pState, pUseContext);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState pState) {
		return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
	}

	@Override
	@SuppressWarnings("deprecation")
	public BlockState mirror(BlockState state, Mirror mirror) {
		return state.rotate(mirror.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState rotate(BlockState state, LevelAccessor world, BlockPos pos, Rotation direction) {
		return state.setValue(FACING, direction.rotate(state.getValue(FACING)));
	}
	
	@Override
	public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
		return false;
	}

}
