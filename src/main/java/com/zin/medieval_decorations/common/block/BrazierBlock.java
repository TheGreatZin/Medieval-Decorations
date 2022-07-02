package com.zin.medieval_decorations.common.block;

import java.util.Random;

import com.zin.medieval_decorations.core.init.TagInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.ForgeEventFactory;

public class BrazierBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final BooleanProperty BURNING = BooleanProperty.create("burning");
	public static final VoxelShape SHAPE = Shapes.or(
			Block.box(1, 0, 1, 15, 15, 2),
			Block.box(1, 0, 14, 15, 15, 15),
			Block.box(14, 0, 2, 15, 15, 14),
			Block.box(1, 0, 2, 2, 15, 14),
			Block.box(2, 4, 2, 14, 5, 14));
	

	public BrazierBlock(Properties properties) {
		super(properties.lightLevel(state -> {
			return state.getValue(BURNING) ? 15 : 0;
		}));
		this.registerDefaultState(this.defaultBlockState()
				.setValue(FACING, Direction.NORTH)
				.setValue(WATERLOGGED, Boolean.valueOf(false))
				.setValue(BURNING, false));

	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(BURNING, WATERLOGGED, FACING);
	}
	
	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return SHAPE;
	}
	
	@Override
	public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
	      if (pState.getValue(BURNING) && !pEntity.fireImmune() && pEntity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)pEntity)) {
	         pEntity.hurt(DamageSource.IN_FIRE, 1.0F);
	      }

	      super.stepOn(pLevel, pPos, pState, pEntity);
	}
	
	@Override
	@SuppressWarnings("deprecation")
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(handIn);
        if (state.getValue(BURNING)) {
            if (heldItem.getItem() instanceof ShovelItem) {
                worldIn.playSound(null, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 0.8F, 1.0F);

                worldIn.setBlockAndUpdate(pos, state.setValue(BURNING, false));
                return InteractionResult.SUCCESS;
            }
        } else if (!state.getValue(WATERLOGGED)) {
            if (heldItem.getItem() == Items.FLINT_AND_STEEL || heldItem.getItem() == Items.FIRE_CHARGE) {

                SoundEvent sound = (heldItem.getItem() == Items.FIRE_CHARGE) ? SoundEvents.FIRECHARGE_USE : SoundEvents.FLINTANDSTEEL_USE;
                worldIn.playSound(null, pos, sound, SoundSource.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.4F + 0.8F);

                worldIn.setBlockAndUpdate(pos, state.setValue(BURNING, true));
    			return InteractionResult.sidedSuccess(worldIn.isClientSide);

            }
        }
        return super.use(state, worldIn, pos, player, handIn, hit);
    }

	@Override
	public void onProjectileHit(Level world, BlockState state, BlockHitResult hit, Projectile projectile) {
		if(!world.isClientSide() && projectile.isOnFire()) {
			Entity owner = projectile.getOwner();
			boolean flag = owner == null || owner instanceof Player || ForgeEventFactory.getMobGriefingEvent(world, owner);
			if (flag && !state.getValue(BURNING))
				world.setBlock(hit.getBlockPos(), state.setValue(BURNING, true), 11);
		}
	}
	
	
	@Override
	public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
	    if (pState.getValue(BURNING)) {
	    	if (pRandom.nextInt(10) == 0) {
	    	pLevel.playLocalSound((double)pPos.getX()
	    			+ 0.5D, (double)pPos.getY()
	    			+ 0.5D, (double)pPos.getZ()
	    			+ 0.5D, SoundEvents.BLASTFURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 0.5F + pRandom.nextFloat(), pRandom.nextFloat() * 0.7F + 0.6F, false);
		}
		double d0 = (double) pPos.getX() + 0.5D;
		double d1 = (double) pPos.getY() + 0.7D;
		double d2 = (double) pPos.getZ() + 0.5D;
		double d3 = (double) pPos.getX() + pRandom.nextDouble();
		double d4 = (double) pPos.getY() + pRandom.nextDouble();
		double d5 = (double) pPos.getZ() + pRandom.nextDouble();
		pLevel.addParticle(ParticleTypes.LARGE_SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		pLevel.addParticle(ParticleTypes.SMOKE, d3, d4, d5, 0.0D, 0.0D, 0.0D);
	    }
	}
	
	@Override
    public boolean placeLiquid(LevelAccessor worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        if (!state.getValue(BlockStateProperties.WATERLOGGED) && fluidStateIn.getType() == Fluids.WATER) {
            boolean flag = state.getValue(BURNING);
            if (flag) {
                worldIn.playSound((Player) null, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            worldIn.setBlock(pos, state.setValue(WATERLOGGED, Boolean.TRUE).setValue(BURNING, false), 3);
            worldIn.scheduleTick(pos, fluidStateIn.getType(), fluidStateIn.getType().getTickDelay(worldIn));
            return true;
        } else {
            return false;
        }
    }
		
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
		return this.defaultBlockState()
				.setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER)
				.setValue(FACING, context.getHorizontalDirection());

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
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

	@Override
	public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
		return false;
	}
	
	public static boolean isBurningState(BlockState blockState) {
        return blockState.hasProperty(BURNING) && blockState.is(TagInit.Blocks.BRAZIERS) && blockState.getValue(BURNING);
    }
	
	
}
