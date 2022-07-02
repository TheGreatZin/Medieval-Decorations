package com.zin.medieval_decorations.common.block;

import java.util.List;
import java.util.function.ToIntFunction;

import com.google.common.collect.ImmutableList;
import com.zin.medieval_decorations.common.block.template.AbstractLargeCandleBlock;
import com.zin.medieval_decorations.core.init.TagInit;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.AbstractCandleBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.ForgeEventFactory;

public class LargeCandleBlock extends AbstractLargeCandleBlock implements SimpleWaterloggedBlock {
	public static final int MIN_CANDLES = 1;
	public static final int MAX_CANDLES = 4;
	public static final IntegerProperty CANDLES = BlockStateProperties.CANDLES;
	public static final BooleanProperty LIT = AbstractCandleBlock.LIT;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final ToIntFunction<BlockState> LIGHT_EMISSION = (p_152848_) -> {
		return p_152848_.getValue(LIT) ? 4 * p_152848_.getValue(CANDLES) : 0;
	};
	private static final Int2ObjectMap<List<Vec3>> PARTICLE_OFFSETS = Util.make(() -> {
		Int2ObjectMap<List<Vec3>> int2objectmap = new Int2ObjectOpenHashMap<>();
		int2objectmap.defaultReturnValue(ImmutableList.of());
		int2objectmap.put(1, ImmutableList.of(new Vec3(0.5D, 0.8D, 0.5D)));
		int2objectmap.put(2, ImmutableList.of(new Vec3(0.3D, 0.7D, 0.5D), new Vec3(0.7D, 0.8D, 0.44D)));
		int2objectmap.put(3, ImmutableList.of(new Vec3(0.5D, 0.6D, 0.7D), new Vec3(0.2D, 0.7D, 0.4D), new Vec3(0.6D, 0.8D, 0.4D)));
		int2objectmap.put(4, ImmutableList.of(new Vec3(0.4D, 0.6D, 0.7D), new Vec3(0.7D, 0.7D, 0.7D), new Vec3(0.3D, 0.7D, 0.4D), new Vec3(0.6D, 0.8D, 0.375D)));
		return Int2ObjectMaps.unmodifiable(int2objectmap);
	});
	private static final VoxelShape ONE_AABB = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D);
	private static final VoxelShape TWO_AABB = Block.box(3.0D, 0.0D, 4.0D, 13.0D, 10.0D, 11.0D);
	private static final VoxelShape THREE_AABB = Block.box(2.0D, 0.0D, 4.0D, 13.0D, 10.0D, 13.0D);
	private static final VoxelShape FOUR_AABB = Block.box(2.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D);

	public LargeCandleBlock(Properties properties) {
		super(properties);
	      this.registerDefaultState(this.stateDefinition.any().setValue(CANDLES, Integer.valueOf(1)).setValue(LIT, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		switch (pState.getValue(CANDLES)) {
		case 1:
		default:
			return ONE_AABB;
		case 2:
			return TWO_AABB;
		case 3:
			return THREE_AABB;
		case 4:
			return FOUR_AABB;
		}
	}

	@Override
	@SuppressWarnings("deprecation")
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
		ItemStack heldItem = player.getItemInHand(handIn);
		if (!state.getValue(WATERLOGGED)) {
            if (heldItem.getItem() == Items.FLINT_AND_STEEL || heldItem.getItem() == Items.FIRE_CHARGE) {

                SoundEvent sound = (heldItem.getItem() == Items.FIRE_CHARGE) ? SoundEvents.FIRECHARGE_USE : SoundEvents.FLINTANDSTEEL_USE;
                worldIn.playSound(null, pos, sound, SoundSource.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.4F + 0.8F);

                worldIn.setBlockAndUpdate(pos, state.setValue(LIT, true));
    			return InteractionResult.sidedSuccess(worldIn.isClientSide);
            }
            if (player.getAbilities().mayBuild && player.getItemInHand(handIn).isEmpty() && state.getValue(LIT)) {
    			extinguish(player, state, worldIn, pos);
    			return InteractionResult.sidedSuccess(worldIn.isClientSide);
    		} else {
    			return InteractionResult.PASS;
    		}
        }
        return super.use(state, worldIn, pos, player, handIn, hit);
    }
	
	@Override
	public void onProjectileHit(Level world, BlockState state, BlockHitResult hit, Projectile projectile) {
	if (projectile instanceof ThrownPotion potion && PotionUtils.getPotion(potion.getItem()) == Potions.WATER) {
		Entity owner = projectile.getOwner();
        boolean flag = owner == null || owner instanceof Player || ForgeEventFactory.getMobGriefingEvent(world, owner);
        if (flag && !state.getValue(LIT))
			world.setBlock(hit.getBlockPos(), state.setValue(LIT, false), 11);
        }
	}

	@Override
	@SuppressWarnings("deprecation")
	public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
		return !pUseContext.isSecondaryUseActive() && pUseContext.getItemInHand().getItem() == this.asItem() && pState.getValue(CANDLES) < 4 ? true : super.canBeReplaced(pState, pUseContext);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		BlockState blockstate = pContext.getLevel().getBlockState(pContext.getClickedPos());
		if (blockstate.is(this)) {
			return blockstate.cycle(CANDLES);
		} else {
			FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
			boolean flag = fluidstate.getType() == Fluids.WATER;
			return super.getStateForPlacement(pContext).setValue(WATERLOGGED, Boolean.valueOf(flag));
		}
	}

	@Override
	@SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
		if (pState.getValue(WATERLOGGED)) {
			pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
		}

		return super.updateShape(pState, pDirection, pNeighborState, pLevel, pCurrentPos, pNeighborPos);
	}

	@Override
	@SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState pState) {
		return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(CANDLES, LIT, WATERLOGGED);
	}

	@Override
	public boolean placeLiquid(LevelAccessor pLevel, BlockPos pPos, BlockState pState, FluidState pFluidState) {
		if (!pState.getValue(WATERLOGGED) && pFluidState.getType() == Fluids.WATER) {
			BlockState blockstate = pState.setValue(WATERLOGGED, Boolean.valueOf(true));
			if (pState.getValue(LIT)) {
				extinguish((Player) null, blockstate, pLevel, pPos);
			} else {
				pLevel.setBlock(pPos, blockstate, 3);
			}

			pLevel.scheduleTick(pPos, pFluidState.getType(), pFluidState.getType().getTickDelay(pLevel));
			return true;
		} else {
			return false;
		}
	}

	public static boolean canLight(BlockState pState) {
		return pState.is(TagInit.Blocks.LARGE_CANDLES, (p_152810_) -> {
			return p_152810_.hasProperty(LIT) && p_152810_.hasProperty(WATERLOGGED);
		}) && !pState.getValue(LIT) && !pState.getValue(WATERLOGGED);
	}
	
	@Override
	protected Iterable<Vec3> getParticleOffsets(BlockState pState) {
		return PARTICLE_OFFSETS.get(pState.getValue(CANDLES).intValue());
	}
	
	@Override
	protected boolean canBeLit(BlockState pState) {
		return !pState.getValue(WATERLOGGED) && super.canBeLit(pState);
	}

	@Override
	public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
		return Block.canSupportCenter(pLevel, pPos.below(), Direction.UP);
	}
	
	@Override
    public boolean isPathfindable(BlockState state, BlockGetter worldIn, BlockPos pos, PathComputationType type) {
        return false;
    }
}
