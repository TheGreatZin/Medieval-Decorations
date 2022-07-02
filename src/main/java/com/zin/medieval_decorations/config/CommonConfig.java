package com.zin.medieval_decorations.config;

import java.lang.reflect.Field;

import com.zin.medieval_decorations.core.Constants;

import net.minecraftforge.common.ForgeConfigSpec;

public final class CommonConfig {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec COMMON_SPEC;
	
	
	// Barrels //
	public static final ForgeConfigSpec.BooleanValue BARREL_PLANTER_ENABLED;

	public static final ForgeConfigSpec.BooleanValue BARREL_OF_FLOWERS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_ALLIUMS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_AZURE_BLUETS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_BLUE_ORCHID_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_CORNFLOWERS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_DANDELIONS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_LILAC_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_LILIES_OF_THE_VALLEY_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_OXEYE_DAISIES_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_PEONY_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_POPPIES_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_ROSES_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_SUNFLOWERS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BARREL_OF_TULIPS_ENABLED;

	// Bars //
	public static final ForgeConfigSpec.BooleanValue ACACIA_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BIRCH_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue CRIMSON_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DARK_OAK_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue JUNGLE_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue OAK_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SPRUCE_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue WARPED_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_BARS_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_BARS_ENABLED;

	public static final ForgeConfigSpec.BooleanValue ACACIA_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BIRCH_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue CRIMSON_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DARK_OAK_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue JUNGLE_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue OAK_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SPRUCE_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue WARPED_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_GRATE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_GRATE_ENABLED;

	// Benches //
	public static final ForgeConfigSpec.BooleanValue ACACIA_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BIRCH_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue CRIMSON_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DARK_OAK_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue JUNGLE_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue OAK_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SPRUCE_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue WARPED_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_BENCH_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_BENCH_ENABLED;

	// Books //
	public static final ForgeConfigSpec.BooleanValue STACKED_BOOKS_ENABLED;

	// Braziers //
	public static final ForgeConfigSpec.BooleanValue GOLD_BRAZIER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_BRAZIER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SOUL_GOLD_BRAZIER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SOUL_IRON_BRAZIER_ENABLED;

	public static final ForgeConfigSpec.BooleanValue GOLD_FIRE_BOWL_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_FIRE_BOWL_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SOUL_GOLD_FIRE_BOWL_ENABLED;
	public static final ForgeConfigSpec.BooleanValue SOUL_IRON_FIRE_BOWL_ENABLED;

	// Candles //
	public static final ForgeConfigSpec.BooleanValue BONE_TWO_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BONE_THREE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BONE_FIVE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BONE_SEVEN_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_TWO_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_THREE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_FIVE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_SEVEN_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_TWO_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_THREE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_FIVE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_SEVEN_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_TWO_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_THREE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_FIVE_ARM_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_SEVEN_ARM_CANDELABRA_ENABLED;

	public static final ForgeConfigSpec.BooleanValue BONE_CANDLE_STAND_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BONE_SKULL_CANDLE_STAND_ENABLED;
	public static final ForgeConfigSpec.BooleanValue DIAMOND_CANDLE_STAND_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_CANDLE_STAND_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_CANDLE_STAND_ENABLED;

	public static final ForgeConfigSpec.BooleanValue LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue WHITE_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue ORANGE_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue MAGENTA_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue LIGHT_BLUE_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue YELLOW_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue LIME_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue PINK_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GRAY_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue LIGHT_GRAY_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue CYAN_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue PURPLE_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BLUE_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BROWN_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GREEN_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue RED_LARGE_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BLACK_LARGE_CANDLE_ENABLED;

	public static final ForgeConfigSpec.BooleanValue GOLD_ANGEL_STATUE_HOLDING_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_MAN_STATUE_HOLDING_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GOLD_VILLAGER_STATUE_HOLDING_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue IRON_ANGEL_STATUE_HOLDING_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue STONE_ANGEL_STATUE_HOLDING_CANDELABRA_ENABLED;
	public static final ForgeConfigSpec.BooleanValue STONE_MAN_STATUE_HOLDING_CANDLE_ENABLED;
	public static final ForgeConfigSpec.BooleanValue STONE_VILLAGER_STATUE_HOLDING_CANDLE_ENABLED;

	public static final ForgeConfigSpec.BooleanValue GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue WHITE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue ORANGE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue MAGENTA_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue LIGHT_BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue YELLOW_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue LIME_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue PINK_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue LIGHT_GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue CYAN_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue PURPLE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BROWN_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue GREEN_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue RED_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue BLACK_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;
	public static final ForgeConfigSpec.BooleanValue MOSAIC_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED;

	
	public static boolean isEnabled(String path) {
		for (Field f : CommonConfig.class.getDeclaredFields()) {
			try {
				if (ForgeConfigSpec.BooleanValue.class.isAssignableFrom(f.getType())) {
					ForgeConfigSpec.BooleanValue b = (ForgeConfigSpec.BooleanValue) f.get(null);
					String p = b.getPath().get(b.getPath().size() - 1);
					if (p.equals(path))
						return b.get();
				}
			} catch (Exception ignored) {
			}
		}
		return true;
	}

	static {
		BUILDER.comment("Configs for Medieval Decorations", "Disable Unwanted Features", "Reload is required for changes to take effect", "Everything is listed in ascending order");
		
		BUILDER.push("Blocks");
		
		BUILDER.push(Constants.CATEGORY_BARRELS);
		BUILDER.comment("Barrel Planter");
        BARREL_PLANTER_ENABLED = BUILDER.define(Constants.BARREL_PLANTER_ID, true);
        BUILDER.comment("Flower Barrels");
        BARREL_OF_FLOWERS_ENABLED = BUILDER.define(Constants.BARREL_OF_FLOWERS_ID, true);
        BARREL_OF_ALLIUMS_ENABLED = BUILDER.define(Constants.BARREL_OF_ALLIUMS_ID, true);
        BARREL_OF_AZURE_BLUETS_ENABLED = BUILDER.define(Constants.BARREL_OF_AZURE_BLUETS_ID, true);
        BARREL_OF_BLUE_ORCHID_ENABLED = BUILDER.define(Constants.BARREL_OF_BLUE_ORCHIDS_ID, true);
        BARREL_OF_CORNFLOWERS_ENABLED = BUILDER.define(Constants.BARREL_OF_CORNFLOWERS_ID, true);
        BARREL_OF_DANDELIONS_ENABLED = BUILDER.define(Constants.BARREL_OF_DANDELIONS_ID, true);
        BARREL_OF_LILAC_ENABLED = BUILDER.define(Constants.BARREL_OF_LILAC_ID, true);
        BARREL_OF_LILIES_OF_THE_VALLEY_ENABLED = BUILDER.define(Constants.BARREL_OF_LILIES_OF_THE_VALLEY_ID, true);
        BARREL_OF_OXEYE_DAISIES_ENABLED = BUILDER.define(Constants.BARREL_OF_OXEYE_DAISIES_ID, true);
        BARREL_OF_PEONY_ENABLED = BUILDER.define(Constants.BARREL_OF_PEONY_ID, true);
        BARREL_OF_POPPIES_ENABLED = BUILDER.define(Constants.BARREL_OF_POPPIES_ID, true);
        BARREL_OF_ROSES_ENABLED = BUILDER.define(Constants.BARREL_OF_ROSES_ID, true);
        BARREL_OF_SUNFLOWERS_ENABLED = BUILDER.define(Constants.BARREL_OF_SUNFLOWERS_ID, true);
        BARREL_OF_TULIPS_ENABLED = BUILDER.define(Constants.BARREL_OF_TULIPS_ID, true);
		BUILDER.pop();
        
		BUILDER.push(Constants.CATEGORY_BARS);
		BUILDER.comment("Bars");
        ACACIA_BARS_ENABLED = BUILDER.define(Constants.ACACIA_BARS_ID, true);
        BIRCH_BARS_ENABLED = BUILDER.define(Constants.BIRCH_BARS_ID, true);
        CRIMSON_BARS_ENABLED = BUILDER.define(Constants.CRIMSON_BARS_ID, true);
        DARK_OAK_BARS_ENABLED = BUILDER.define(Constants.DARK_OAK_BARS_ID, true);
        JUNGLE_BARS_ENABLED = BUILDER.define(Constants.JUNGLE_BARS_ID, true);
        OAK_BARS_ENABLED = BUILDER.define(Constants.OAK_BARS_ID, true);
        SPRUCE_BARS_ENABLED = BUILDER.define(Constants.SPRUCE_BARS_ID, true);
        WARPED_BARS_ENABLED = BUILDER.define(Constants.WARPED_BARS_ID, true);
        DIAMOND_BARS_ENABLED = BUILDER.define(Constants.DIAMOND_BARS_ID, true);
        GOLD_BARS_ENABLED = BUILDER.define(Constants.GOLD_BARS_ID, true);
        BUILDER.comment("Grates");
        ACACIA_GRATE_ENABLED = BUILDER.define(Constants.ACACIA_GRATE_ID, true);
        BIRCH_GRATE_ENABLED = BUILDER.define(Constants.BIRCH_GRATE_ID, true);
        CRIMSON_GRATE_ENABLED = BUILDER.define(Constants.CRIMSON_GRATE_ID, true);
        DARK_OAK_GRATE_ENABLED = BUILDER.define(Constants.DARK_OAK_GRATE_ID, true);
        JUNGLE_GRATE_ENABLED = BUILDER.define(Constants.JUNGLE_GRATE_ID, true);
        OAK_GRATE_ENABLED = BUILDER.define(Constants.OAK_GRATE_ID, true);
        SPRUCE_GRATE_ENABLED = BUILDER.define(Constants.SPRUCE_GRATE_ID, true);
        WARPED_GRATE_ENABLED = BUILDER.define(Constants.WARPED_GRATE_ID, true);
        DIAMOND_GRATE_ENABLED = BUILDER.define(Constants.DIAMOND_GRATE_ID, true);
        GOLD_GRATE_ENABLED = BUILDER.define(Constants.GOLD_GRATE_ID, true);
        IRON_GRATE_ENABLED = BUILDER.define(Constants.IRON_GRATE_ID, true);
		BUILDER.pop();
        
		BUILDER.push(Constants.CATEGORY_BENCHES);
		BUILDER.comment("Benches");
        ACACIA_BENCH_ENABLED = BUILDER.define(Constants.ACACIA_BENCH_ID, true);
        BIRCH_BENCH_ENABLED = BUILDER.define(Constants.BIRCH_BENCH_ID, true);
        CRIMSON_BENCH_ENABLED = BUILDER.define(Constants.CRIMSON_BENCH_ID, true);
        DARK_OAK_BENCH_ENABLED = BUILDER.define(Constants.DARK_OAK_BENCH_ID, true);
        JUNGLE_BENCH_ENABLED = BUILDER.define(Constants.JUNGLE_BENCH_ID, true);
        OAK_BENCH_ENABLED = BUILDER.define(Constants.OAK_BENCH_ID, true);
        SPRUCE_BENCH_ENABLED = BUILDER.define(Constants.SPRUCE_BENCH_ID, true);
        WARPED_BENCH_ENABLED = BUILDER.define(Constants.WARPED_BENCH_ID, true);
        GOLD_BENCH_ENABLED = BUILDER.define(Constants.GOLD_BENCH_ID, true);
        IRON_BENCH_ENABLED = BUILDER.define(Constants.IRON_BENCH_ID, true);
		BUILDER.pop();
        
		BUILDER.push(Constants.CATEGORY_BOOKS);
		BUILDER.comment("Books");
        STACKED_BOOKS_ENABLED = BUILDER.define(Constants.STACKED_BOOKS_ID, true);
		BUILDER.pop();
        
		BUILDER.push(Constants.CATEGORY_BRAZIERS);
		BUILDER.comment("Braziers");
        GOLD_BRAZIER_ENABLED = BUILDER.define(Constants.GOLD_BRAZIER_ID, true);
        IRON_BRAZIER_ENABLED = BUILDER.define(Constants.IRON_BRAZIER_ID, true);
        SOUL_GOLD_BRAZIER_ENABLED = BUILDER.define(Constants.SOUL_GOLD_BRAZIER_ID, true);
        SOUL_IRON_BRAZIER_ENABLED = BUILDER.define(Constants.SOUL_IRON_BRAZIER_ID, true);
        BUILDER.comment("Fire Bowls");
        GOLD_FIRE_BOWL_ENABLED = BUILDER.define(Constants.GOLD_FIRE_BOWL_ID, true);
        IRON_FIRE_BOWL_ENABLED = BUILDER.define(Constants.IRON_FIRE_BOWL_ID, true);
        SOUL_GOLD_FIRE_BOWL_ENABLED = BUILDER.define(Constants.SOUL_GOLD_FIRE_BOWL_ID, true);
        SOUL_IRON_FIRE_BOWL_ENABLED = BUILDER.define(Constants.SOUL_IRON_FIRE_BOWL_ID, true);
		BUILDER.pop();
        
		BUILDER.push(Constants.CATEGORY_CANDLES);
		BUILDER.comment("Candelabras");
        BONE_TWO_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.BONE_TWO_ARM_CANDELABRA_ID, true);
        BONE_THREE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.BONE_THREE_ARM_CANDELABRA_ID, true);
        BONE_FIVE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.BONE_FIVE_ARM_CANDELABRA_ID, true);
        BONE_SEVEN_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.BONE_SEVEN_ARM_CANDELABRA_ID, true);
        DIAMOND_TWO_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.DIAMOND_TWO_ARM_CANDELABRA_ID, true);
        DIAMOND_THREE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.DIAMOND_THREE_ARM_CANDELABRA_ID, true);
        DIAMOND_FIVE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.DIAMOND_FIVE_ARM_CANDELABRA_ID, true);
        DIAMOND_SEVEN_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.DIAMOND_SEVEN_ARM_CANDELABRA_ID, true);
        GOLD_TWO_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.GOLD_TWO_ARM_CANDELABRA_ID, true);
        GOLD_THREE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.GOLD_THREE_ARM_CANDELABRA_ID, true);
        GOLD_FIVE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.GOLD_FIVE_ARM_CANDELABRA_ID, true);
        GOLD_SEVEN_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.GOLD_SEVEN_ARM_CANDELABRA_ID, true);
        IRON_TWO_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.IRON_TWO_ARM_CANDELABRA_ID, true);
        IRON_THREE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.IRON_THREE_ARM_CANDELABRA_ID, true);
        IRON_FIVE_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.IRON_FIVE_ARM_CANDELABRA_ID, true);
        IRON_SEVEN_ARM_CANDELABRA_ENABLED = BUILDER.define(Constants.IRON_SEVEN_ARM_CANDELABRA_ID, true);
        BUILDER.comment("Candlesticks");
        BONE_CANDLE_STAND_ENABLED = BUILDER.define(Constants.BONE_CANDLE_STAND_ID, true);
        BONE_SKULL_CANDLE_STAND_ENABLED = BUILDER.define(Constants.BONE_SKULL_CANDLE_STAND_ID, true);
        DIAMOND_CANDLE_STAND_ENABLED = BUILDER.define(Constants.DIAMOND_CANDLE_STAND_ID, true);
        GOLD_CANDLE_STAND_ENABLED = BUILDER.define(Constants.GOLD_CANDLE_STAND_ID, true);
        IRON_CANDLE_STAND_ENABLED = BUILDER.define(Constants.IRON_CANDLE_STAND_ID, true);
        BUILDER.comment("Large Candles");
        LARGE_CANDLE_ENABLED = BUILDER.define(Constants.LARGE_CANDLE_ID, true);
        WHITE_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.WHITE_LARGE_CANDLE_ID, true);
        ORANGE_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.ORANGE_LARGE_CANDLE_ID, true);
        MAGENTA_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.MAGENTA_LARGE_CANDLE_ID, true);
        LIGHT_BLUE_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.LIGHT_BLUE_LARGE_CANDLE_ID, true);
        YELLOW_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.YELLOW_LARGE_CANDLE_ID, true);
        LIME_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.LIME_LARGE_CANDLE_ID, true);
        PINK_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.PINK_LARGE_CANDLE_ID, true);
        GRAY_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.GRAY_LARGE_CANDLE_ID, true);
        LIGHT_GRAY_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.LIGHT_GRAY_LARGE_CANDLE_ID, true);
        CYAN_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.CYAN_LARGE_CANDLE_ID, true);
        PURPLE_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.PURPLE_LARGE_CANDLE_ID, true);
        BLUE_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.BLUE_LARGE_CANDLE_ID, true);
        BROWN_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.BROWN_LARGE_CANDLE_ID, true);
        GREEN_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.GREEN_LARGE_CANDLE_ID, true);
        RED_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.RED_LARGE_CANDLE_ID, true);
        BLACK_LARGE_CANDLE_ENABLED = BUILDER.define(Constants.BLACK_LARGE_CANDLE_ID, true);
        BUILDER.comment("Statues Holding Candles");
        GOLD_ANGEL_STATUE_HOLDING_CANDELABRA_ENABLED = BUILDER.define(Constants.GOLD_ANGEL_STATUE_HOLDING_CANDELABRA_ID, true);
        GOLD_MAN_STATUE_HOLDING_CANDLE_ENABLED = BUILDER.define(Constants.GOLD_MAN_STATUE_HOLDING_CANDLE_ID, true);
        GOLD_VILLAGER_STATUE_HOLDING_CANDLE_ENABLED = BUILDER.define(Constants.GOLD_VILLAGER_STATUE_HOLDING_CANDLE_ID, true);
        IRON_ANGEL_STATUE_HOLDING_CANDELABRA_ENABLED = BUILDER.define(Constants.IRON_ANGEL_STATUE_HOLDING_CANDELABRA_ID, true);
        STONE_ANGEL_STATUE_HOLDING_CANDELABRA_ENABLED = BUILDER.define(Constants.STONE_ANGEL_STATUE_HOLDING_CANDELABRA_ID, true);
        STONE_MAN_STATUE_HOLDING_CANDLE_ENABLED = BUILDER.define(Constants.STONE_MAN_STATUE_HOLDING_CANDLE_ID, true);
        STONE_VILLAGER_STATUE_HOLDING_CANDLE_ENABLED = BUILDER.define(Constants.STONE_VILLAGER_STATUE_HOLDING_CANDLE_ID, true);
        BUILDER.comment("Vase Candleholders");
        GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.GLASS_VASE_CANDLEHOLDER_ID, true);
        WHITE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.WHITE_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        ORANGE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.ORANGE_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        MAGENTA_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.MAGENTA_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        LIGHT_BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.LIGHT_BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        YELLOW_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.YELLOW_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        LIME_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.LIME_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        PINK_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.PINK_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        LIGHT_GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.LIGHT_GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        CYAN_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.CYAN_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        PURPLE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.PURPLE_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        BROWN_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.BROWN_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        GREEN_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.GREEN_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        RED_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.RED_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        BLACK_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.BLACK_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
        MOSAIC_STAINED_GLASS_VASE_CANDLEHOLDER_ENABLED = BUILDER.define(Constants.MOSAIC_STAINED_GLASS_VASE_CANDLEHOLDER_ID, true);
		BUILDER.pop();
		BUILDER.pop();
        
		COMMON_SPEC = BUILDER.build();
	}

}
