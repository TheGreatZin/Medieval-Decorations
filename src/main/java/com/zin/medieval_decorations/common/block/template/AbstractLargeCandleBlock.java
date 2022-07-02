package com.zin.medieval_decorations.common.block.template;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public abstract class AbstractLargeCandleBlock extends Block {
	public static final int LIGHT_PER_CANDLE = 4;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;

	protected AbstractLargeCandleBlock(BlockBehaviour.Properties properties) {
		super(properties);
	}
	
	protected abstract Iterable<Vec3> getParticleOffsets(BlockState pState);

	@Override
	public void onProjectileHit(Level pLevel, BlockState pState, BlockHitResult pHit, Projectile pProjectile) {
	      if (!pLevel.isClientSide && pProjectile.isOnFire() && this.canBeLit(pState)) {
	         setLit(pLevel, pState, pHit.getBlockPos(), true);
	      }

	   }
	
	@Override
	public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
		if (pState.getValue(LIT)) {
			this.getParticleOffsets(pState).forEach((p_151917_) -> {
				addParticlesAndSound(pLevel,
						p_151917_.add((double) pPos.getX(),
									  (double) pPos.getY(),
								      (double) pPos.getZ()), pRandom);
			});
		}
	}

	private static void addParticlesAndSound(Level level, Vec3 vec3, Random random) {
		float f = random.nextFloat();
		if (f < 0.3F) {
			level.addParticle(ParticleTypes.SMOKE, vec3.x, vec3.y, vec3.z, 0.0D, 0.0D, 0.0D);
			if (f < 0.17F) {
				level.playLocalSound(vec3.x + 0.5D, vec3.y + 0.5D, vec3.z + 0.5D, SoundEvents.CANDLE_AMBIENT, SoundSource.BLOCKS, 1.0F + random.nextFloat(),
						random.nextFloat() * 0.7F + 0.3F, false);
			}
		}

		level.addParticle(ParticleTypes.FLAME, vec3.x, vec3.y, vec3.z, 0.0D, 0.0D, 0.0D);
	}
	
	protected boolean canBeLit(BlockState pState) {
	      return !pState.getValue(LIT);
	}
	
	public static void extinguish(@Nullable Player player, BlockState state, LevelAccessor accessor, BlockPos pos) {
		setLit(accessor, state, pos, false);
		if (state.getBlock() instanceof AbstractLargeCandleBlock) {
			((AbstractLargeCandleBlock) state.getBlock()).getParticleOffsets(state).forEach((p_151926_) -> {
				accessor.addParticle(ParticleTypes.SMOKE,
						(double) pos.getX() + p_151926_.x(),
						(double) pos.getY() + p_151926_.y(),
						(double) pos.getZ() + p_151926_.z(), 0.0D,
						(double) 0.1F, 0.0D);
			});
		}

		accessor.playSound((Player) null, pos, SoundEvents.CANDLE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, 1.0F);
		accessor.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
	}

	private static void setLit(LevelAccessor pLevel, BlockState pState, BlockPos pPos, boolean pLit) {
		pLevel.setBlock(pPos, pState.setValue(LIT, Boolean.valueOf(pLit)), 11);
	}

}