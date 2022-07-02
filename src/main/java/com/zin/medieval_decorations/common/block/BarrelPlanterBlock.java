package com.zin.medieval_decorations.common.block;

import com.zin.medieval_decorations.common.block.template.FlammableBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;

public class BarrelPlanterBlock extends FlammableBlock {

	public BarrelPlanterBlock(Properties properties) {
		super(properties);
	}
	
	@Override
    public boolean isFertile(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
        return true;
    }
	

}
