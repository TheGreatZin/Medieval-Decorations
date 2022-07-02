package com.zin.medieval_decorations.common.block;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.zin.medieval_decorations.common.block.template.FacingSittableBlock;
import com.zin.medieval_decorations.util.VoxelShapeHelper;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SofaBlock extends FacingSittableBlock {
	public static final EnumProperty<Type> TYPE = EnumProperty.create("type", Type.class);

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

	public SofaBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.getStateDefinition().any().setValue(TYPE, Type.SINGLE));
		SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
	}

	// right = left
	private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] BASE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 3, 16, 8, 16), Direction.NORTH));
        final VoxelShape[] BASE_RIGHT_LARGE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(1, 4, 0, 13, 8, 15), Direction.NORTH));
        final VoxelShape[] BASE_LEFT_LARGE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 3, 15, 8, 15), Direction.NORTH));
        final VoxelShape[] BASE_RIGHT_SMALL = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(13, 4, 3, 16, 8, 14), Direction.NORTH));
        final VoxelShape[] BASE_LEFT_SMALL = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(3, 4, 0, 15, 8, 3), Direction.NORTH));
        final VoxelShape[] LEG_BACK_RIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 14, 2, 4, 16), Direction.NORTH));
        final VoxelShape[] LEG_FRONT_RIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 3, 2, 4, 5), Direction.NORTH));
        final VoxelShape[] LEG_BACK_LEFT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 14, 16, 4, 16), Direction.NORTH));
        final VoxelShape[] LEG_FRONT_LEFT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 3, 16, 4, 5), Direction.NORTH));
        final VoxelShape[] BACK_REST = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 8, 14, 16, 18, 16), Direction.NORTH));
        final VoxelShape[] BACK_REST_RIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 8, 3, 2, 18, 14), Direction.NORTH));
        final VoxelShape[] BACK_REST_LEFT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 8, 3, 16, 18, 14), Direction.NORTH));
        final VoxelShape[] ARM_REST_RIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 8, 3, 2, 12, 14), Direction.NORTH));
        final VoxelShape[] ARM_REST_LEFT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 8, 3, 16, 12, 14), Direction.NORTH));

		ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
		for (BlockState state : states) {
			Direction direction = state.getValue(FACING);
			Type type = state.getValue(TYPE);
			List<VoxelShape> shapes = new ArrayList<>();
			switch (type) {
			case MIDDLE:
				shapes.add(BASE[direction.get2DDataValue()]);
				shapes.add(BACK_REST[direction.get2DDataValue()]);
				break;
			case SINGLE:
				shapes.add(LEG_BACK_LEFT[direction.get2DDataValue()]);
				shapes.add(LEG_FRONT_LEFT[direction.get2DDataValue()]);
				shapes.add(LEG_BACK_RIGHT[direction.get2DDataValue()]);
				shapes.add(LEG_FRONT_RIGHT[direction.get2DDataValue()]);
				shapes.add(ARM_REST_LEFT[direction.get2DDataValue()]);
				shapes.add(ARM_REST_RIGHT[direction.get2DDataValue()]);
				shapes.add(BASE[direction.get2DDataValue()]);
				shapes.add(BACK_REST[direction.get2DDataValue()]);
				break;
			case LEFT:
				shapes.add(LEG_BACK_LEFT[direction.get2DDataValue()]);
				shapes.add(LEG_FRONT_LEFT[direction.get2DDataValue()]);
				shapes.add(ARM_REST_LEFT[direction.get2DDataValue()]);
				shapes.add(BASE[direction.get2DDataValue()]);
				shapes.add(BACK_REST[direction.get2DDataValue()]);
				break;
			case RIGHT:
				shapes.add(LEG_FRONT_RIGHT[direction.get2DDataValue()]);
				shapes.add(LEG_BACK_RIGHT[direction.get2DDataValue()]);
				shapes.add(ARM_REST_RIGHT[direction.get2DDataValue()]);
				shapes.add(BASE[direction.get2DDataValue()]);
				shapes.add(BACK_REST[direction.get2DDataValue()]);
				break;
			case CORNER_LEFT:
				shapes.add(LEG_BACK_LEFT[direction.get2DDataValue()]);
				shapes.add(BACK_REST_LEFT[direction.get2DDataValue()]);
				shapes.add(BASE_LEFT_LARGE[direction.get2DDataValue()]);
				shapes.add(BASE_LEFT_SMALL[direction.get2DDataValue()]);
				shapes.add(BACK_REST[direction.get2DDataValue()]);
				break;
			case CORNER_RIGHT:
				shapes.add(LEG_BACK_RIGHT[direction.get2DDataValue()]);
				shapes.add(BACK_REST_RIGHT[direction.get2DDataValue()]);
				shapes.add(BASE_RIGHT_LARGE[direction.get2DDataValue()]);
				shapes.add(BASE_RIGHT_SMALL[direction.get2DDataValue()]);
				shapes.add(BACK_REST[direction.get2DDataValue()]);
				break;
			}
			builder.put(state, VoxelShapeHelper.combineAll(shapes));
		}
		return builder.build();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		return SHAPES.get(state);
	}

	@Override
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos) {
		return SHAPES.get(state);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		return this.getBenchState(state, context.getLevel(), context.getClickedPos(), state.getValue(FACING));
	}

	@Override
	public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level,
			BlockPos pos, BlockPos newPos) {
		return this.getBenchState(state, level, pos, state.getValue(FACING));
	}
	
	//axis z, south (right = right)
	private BlockState getBenchState(BlockState state, LevelAccessor level, BlockPos pos, Direction dir) {
		boolean left = this.isBench(level, pos, dir.getCounterClockWise(), dir) || this.isBench(level, pos, dir.getCounterClockWise(), dir.getCounterClockWise());
		boolean right = this.isBench(level, pos, dir.getClockWise(), dir) || this.isBench(level, pos, dir.getClockWise(), dir.getClockWise());
		boolean cornerLeft = this.isBench(level, pos, dir.getOpposite(), dir.getCounterClockWise());
		boolean cornerRight = this.isBench(level, pos, dir.getOpposite(), dir.getClockWise());
		 
		if (cornerLeft) {
			return state.setValue(TYPE, Type.CORNER_LEFT);
		} else if (cornerRight) {
			return state.setValue(TYPE, Type.CORNER_RIGHT);
		} else if (left && right) {
			return state.setValue(TYPE, Type.MIDDLE);
		} else if (left) {
			return state.setValue(TYPE, Type.RIGHT);
		} else if (right) {
			return state.setValue(TYPE, Type.LEFT);
		}
		return state.setValue(TYPE, Type.SINGLE);
	}

	private boolean isBench(LevelAccessor level, BlockPos source, Direction direction, Direction targetDirection) {
		BlockState state = level.getBlockState(source.relative(direction));
		if (state.getBlock() == this) {
			Direction benchDirection = state.getValue(FACING);
			return benchDirection.equals(targetDirection);
		}
		return false;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(TYPE);
	}

	public enum Type implements StringRepresentable {
		SINGLE("single"),
		LEFT("left"),
		RIGHT("right"),
		MIDDLE("middle"),
		CORNER_LEFT("corner_left"),
		CORNER_RIGHT("corner_right");

		private final String name;

		Type(String id) {
			this.name = id;
		}

		@Override
		public String getSerializedName() {
			return name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	@Override
	public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return true;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}

}
