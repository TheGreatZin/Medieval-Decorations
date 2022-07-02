package com.zin.medieval_decorations.core.init;

import com.zin.medieval_decorations.MedievalDecorations;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class TagInit {
	public static final class Blocks {
		
		// Barrels //
		public static final TagKey<Block> BARRELS = tag("barrels");
		public static final TagKey<Block> FLOWER_BARRELS = tag("flower_barrels");
		
		// Bars //
		public static final TagKey<Block> BARS = tag("bars");
		public static final TagKey<Block> METAL_BARS = tag("metal_bars");
		public static final TagKey<Block> WOODEN_BARS = tag("wooden_bars");
		public static final TagKey<Block> METAL_GRATES = tag("metal_grates");
		public static final TagKey<Block> WOODEN_GRATES = tag("wooden_grates");
		public static final TagKey<Block> GRATES = tag("grates");
		
		// Benches //
		public static final TagKey<Block> METAL_BENCHES = tag("metal_benches");
		public static final TagKey<Block> WOODEN_BENCHES = tag("wooden_benches");
		public static final TagKey<Block> BENCHES = tag("benches");
		
		// Books //
		public static final TagKey<Block> BOOKS = tag("books");
		
		// Braziers //
		public static final TagKey<Block> BRAZIERS = tag("braziers");
		public static final TagKey<Block> FIRE_BOWLS = tag("fire_bowls");
		
		// Candles //
		public static final TagKey<Block> CANDELABRAS = tag("candelabras");
		public static final TagKey<Block> CANDLE_STANDS = tag("candle_stands");
		public static final TagKey<Block> LARGE_CANDLES = tag("large_candles");
		public static final TagKey<Block> STATUE_CANDLES = tag("statue_candles");
		public static final TagKey<Block> VASE_CANDLEHOLDERS = tag("vase_candleholders");






		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(MedievalDecorations.MOD_ID, name));
		}

		private static TagKey<Block> forgeTag(String name) {
			return BlockTags.create(new ResourceLocation("forge", name));
		}
	}

	public static class Items {
		public static final TagKey<Item> MEDIEVAL_DECORATIONS_TAG = forgeTag("medieval_decorations_tag");
		
		public static final TagKey<Item> BARREL_PLANTER_DIRTS = tag("barrel_planter_dirts");

		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(MedievalDecorations.MOD_ID, name));
		}

		private static TagKey<Item> forgeTag(String name) {
			return ItemTags.create(new ResourceLocation("forge", name));
		}
	}

}
