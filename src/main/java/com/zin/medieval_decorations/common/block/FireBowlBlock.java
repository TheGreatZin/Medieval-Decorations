package com.zin.medieval_decorations.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FireBowlBlock extends BrazierBlock {
	public static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 6, 15);
	
	public FireBowlBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return SHAPE;
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
		pLevel.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		pLevel.addParticle(ParticleTypes.SMOKE, d3, d4, d5, 0.0D, 0.0D, 0.0D);
	    }
	}

}
