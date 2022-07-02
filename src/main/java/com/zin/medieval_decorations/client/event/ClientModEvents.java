package com.zin.medieval_decorations.client.event;

import com.zin.medieval_decorations.MedievalDecorations;
import com.zin.medieval_decorations.client.renderer.SeatRenderer;
import com.zin.medieval_decorations.core.init.BlockInit;
import com.zin.medieval_decorations.core.init.EntityInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MedievalDecorations.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

	@SubscribeEvent
	@SuppressWarnings("static-access")
	public static void clientSetup(FMLClientSetupEvent event) {
				
		// Barrels //
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_FLOWERS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_ALLIUMS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_AZURE_BLUETS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_BLUE_ORCHIDS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_CORNFLOWERS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_DANDELIONS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_LILAC.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_LILIES_OF_THE_VALLEY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_OXEYE_DAISIES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_PEONY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_POPPIES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_ROSES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_SUNFLOWERS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BARREL_OF_TULIPS.get(), RenderType.cutout());

		// Bars //
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRIMSON_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SPRUCE_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WARPED_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRIMSON_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SPRUCE_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WARPED_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIAMOND_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_GRATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_GRATE.get(), RenderType.cutout());

		// Benches //
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRIMSON_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SPRUCE_BENCH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WARPED_BENCH.get(), RenderType.cutout());
		
		// Books //
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STACKED_BOOKS.get(), RenderType.cutout());

		// Braziers //
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_BRAZIER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_BRAZIER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SOUL_GOLD_BRAZIER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SOUL_IRON_BRAZIER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_FIRE_BOWL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_FIRE_BOWL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SOUL_GOLD_FIRE_BOWL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SOUL_IRON_FIRE_BOWL.get(), RenderType.cutout());
		
		// Candles
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BONE_TWO_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BONE_THREE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BONE_FIVE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BONE_SEVEN_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIAMOND_TWO_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIAMOND_THREE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIAMOND_FIVE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIAMOND_SEVEN_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_TWO_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_THREE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_FIVE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_SEVEN_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_TWO_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_THREE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_FIVE_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_SEVEN_ARM_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BONE_CANDLE_STAND.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BONE_SKULL_CANDLE_STAND.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIAMOND_CANDLE_STAND.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_CANDLE_STAND.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_CANDLE_STAND.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGENTA_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_BLUE_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.YELLOW_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GRAY_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_GRAY_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CYAN_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BROWN_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GREEN_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACK_LARGE_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_ANGEL_STATUE_HOLDING_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_MAN_STATUE_HOLDING_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOLD_VILLAGER_STATUE_HOLDING_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_ANGEL_STATUE_HOLDING_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_ANGEL_STATUE_HOLDING_CANDELABRA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_MAN_STATUE_HOLDING_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_VILLAGER_STATUE_HOLDING_CANDLE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.MAGENTA_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_BLUE_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.YELLOW_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GRAY_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIGHT_GRAY_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CYAN_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BROWN_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GREEN_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACK_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.MOSAIC_STAINED_GLASS_VASE_CANDLEHOLDER.get(), RenderType.cutout().translucent());

		
		
        EntityRenderers.register(EntityInit.SEAT.get(), SeatRenderer::new);

	}

}
