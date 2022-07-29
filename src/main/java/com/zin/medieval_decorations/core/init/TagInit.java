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
		public static final TagKey<Block> BARRELS = tag("barrels/barrels");
		public static final TagKey<Block> FLOWER_BARRELS = tag("barrels/flower_barrels");
		
		// Bars //
		public static final TagKey<Block> BARS = tag("bars/bars");
		public static final TagKey<Block> METAL_BARS = tag("bars/metal_bars");
		public static final TagKey<Block> WOODEN_BARS = tag("bars/wooden_bars");
		
		// Beds //
		
		
		// Benches //
		public static final TagKey<Block> METAL_BENCHES = tag("benches/metal_benches");
		public static final TagKey<Block> WOODEN_BENCHES = tag("benches/wooden_benches");
		public static final TagKey<Block> BENCHES = tag("benches/benches");
		
		// Books //
		public static final TagKey<Block> BOOKS = tag("books/books");
		
		// Braziers //
		public static final TagKey<Block> BRAZIERS = tag("braziers/braziers");
		
		// Candles //
		public static final TagKey<Block> CANDELABRAS = tag("candles/candelabras");
		public static final TagKey<Block> CANDLE_STANDS = tag("candles/candle_stands");
		public static final TagKey<Block> LARGE_CANDLES = tag("candles/large_candles");
		
		// Fire Bowls //
		public static final TagKey<Block> FIRE_BOWLS = tag("fire_bowls/fire_bowls");
		
		// Grates //
		public static final TagKey<Block> METAL_GRATES = tag("grates/metal_grates");
		public static final TagKey<Block> WOODEN_GRATES = tag("grates/wooden_grates");
		public static final TagKey<Block> GRATES = tag("grates/grates");
		
		// Statues //
		public static final TagKey<Block> STATUE_CANDLES = tag("statues/statue_candles");
		
		// Vases //
		public static final TagKey<Block> VASE_CANDLEHOLDERS = tag("vases/vase_candleholders");

		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(MedievalDecorations.MOD_ID, name));
		}

	}

	public static class Items {
		
		public static final TagKey<Item> GROUP_BARRELS = tag("barrels");
		public static final TagKey<Item> GROUP_BARS = tag("bars");
		public static final TagKey<Item> GROUP_BENCHES = tag("benches");
		public static final TagKey<Item> GROUP_BOOKS = tag("books");
		public static final TagKey<Item> GROUP_BRAZIERS = tag("braziers");
		public static final TagKey<Item> GROUP_CANDLES = tag("candles");
		public static final TagKey<Item> GROUP_FIRE_BOWLS = tag("fire_bowls");
		public static final TagKey<Item> GROUP_GRATES = tag("grates");
		public static final TagKey<Item> GROUP_STATUES = tag("statues");
		public static final TagKey<Item> GROUP_VASES = tag("vases");
		
		// Barrels //
		public static final TagKey<Item> BARRELS = tag("barrels/barrels");
		public static final TagKey<Item> FLOWER_BARRELS = tag("barrels/flower_barrels");
		
		// Bars //
		public static final TagKey<Item> BARS = tag("bars/bars");
		public static final TagKey<Item> METAL_BARS = tag("bars/metal_bars");
		public static final TagKey<Item> WOODEN_BARS = tag("bars/wooden_bars");
		
		// Beds //
		
		// Benches //
		public static final TagKey<Item> METAL_BENCHES = tag("benches/metal_benches");
		public static final TagKey<Item> WOODEN_BENCHES = tag("benches/wooden_benches");
		public static final TagKey<Item> BENCHES = tag("benches/benches");
		
		// Books //
		public static final TagKey<Item> BOOKS = tag("books/books");
		
		// Braziers //
		public static final TagKey<Item> BRAZIERS = tag("braziers/braziers");
		
		// Candles //
		public static final TagKey<Item> CANDELABRAS = tag("candles/candelabras");
		public static final TagKey<Item> CANDLE_STANDS = tag("candles/candle_stands");
		public static final TagKey<Item> LARGE_CANDLES = tag("candles/large_candles");
		
		// Fire Bowls //
		public static final TagKey<Item> FIRE_BOWLS = tag("fire_bowls/fire_bowls");

		// Grates //
		public static final TagKey<Item> METAL_GRATES = tag("grates/metal_grates");
		public static final TagKey<Item> WOODEN_GRATES = tag("grates/wooden_grates");
		public static final TagKey<Item> GRATES = tag("grates/grates");
		
		// Statues //
		public static final TagKey<Item> STATUE_CANDLES = tag("statues/statue_candles");
		
		// Vases //
		public static final TagKey<Item> VASE_CANDLEHOLDERS = tag("vases/vase_candleholders");
		
		
		public static final TagKey<Item> BARREL_PLANTER_DIRTS = tag("barrels/barrel_planter_dirts");
		
		
		public static final TagKey<Item> MEDIEVAL_DECORATIONS_TAG = forgeTag("medieval_decorations_tag");


		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(MedievalDecorations.MOD_ID, name));
		}

		private static TagKey<Item> forgeTag(String name) {
			return ItemTags.create(new ResourceLocation("forge", name));
		}
	}

}
