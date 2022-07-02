package com.zin.medieval_decorations.core.init;

import static com.zin.medieval_decorations.core.Constants.*;

import java.util.function.Supplier;

import com.zin.medieval_decorations.MedievalDecorations;
import com.zin.medieval_decorations.common.block.BarrelPlanterBlock;
import com.zin.medieval_decorations.common.block.BenchBlock;
import com.zin.medieval_decorations.common.block.BrazierBlock;
import com.zin.medieval_decorations.common.block.CandelabraBlock;
import com.zin.medieval_decorations.common.block.FireBowlBlock;
import com.zin.medieval_decorations.common.block.FlowerBarrelBlock;
import com.zin.medieval_decorations.common.block.GlassVaseCandleholderBlock;
import com.zin.medieval_decorations.common.block.GrateBlock;
import com.zin.medieval_decorations.common.block.LargeCandleBlock;
import com.zin.medieval_decorations.common.block.PileOfBooksBlock;
import com.zin.medieval_decorations.common.block.StatueHoldingCandle;
import com.zin.medieval_decorations.common.block.WoodenBarsBlock;
import com.zin.medieval_decorations.common.block.WoodenBenchBlock;
import com.zin.medieval_decorations.common.block.WoodenGrateBlock;
import com.zin.medieval_decorations.common.item.WoodenBlockItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalDecorations.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
/* Barrels */
   public static final RegistryObject<BarrelPlanterBlock> BARREL_PLANTER = registerBlock("barrel_planter", () -> new BarrelPlanterBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.PODZOL).sound(SoundType.WOOD).strength(2.5F)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_PLANTER_ID);
	
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_FLOWERS = registerBlock("barrel_of_flowers", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).speedFactor(0.9F).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_FLOWERS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_ALLIUMS = registerBlock("barrel_of_alliums", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_ALLIUMS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_AZURE_BLUETS = registerBlock("barrel_of_azure_bluets", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_AZURE_BLUETS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_BLUE_ORCHIDS = registerBlock("barrel_of_blue_orchids", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_BLUE_ORCHIDS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_CORNFLOWERS = registerBlock("barrel_of_cornflowers", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_CORNFLOWERS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_DANDELIONS = registerBlock("barrel_of_dandelions", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_DANDELIONS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_LILAC = registerBlock("barrel_of_lilac", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_LILAC_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_LILIES_OF_THE_VALLEY = registerBlock("barrel_of_lilies_of_the_valley", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_LILIES_OF_THE_VALLEY_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_OXEYE_DAISIES = registerBlock("barrel_of_oxeye_daisies", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_OXEYE_DAISIES_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_PEONY = registerBlock("barrel_of_peony", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_PEONY_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_POPPIES = registerBlock("barrel_of_poppies", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_POPPIES_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_ROSES = registerBlock("barrel_of_roses", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_ROSES_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_SUNFLOWERS = registerBlock("barrel_of_sunflowers", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_SUNFLOWERS_ID);
   public static final RegistryObject<FlowerBarrelBlock> BARREL_OF_TULIPS = registerBlock("barrel_of_tulips", () -> new FlowerBarrelBlock(BlockBehaviour.Properties.copy(BlockInit.BARREL_OF_FLOWERS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BARREL_OF_TULIPS_ID);
   
/* Bars */
   public static final RegistryObject<WoodenBarsBlock> ACACIA_BARS = registerWoodenBlock("acacia_bars", () -> new WoodenBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 150, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, ACACIA_BARS_ID);
   public static final RegistryObject<WoodenBarsBlock> BIRCH_BARS = registerWoodenBlock("birch_bars", () -> new WoodenBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 150, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BIRCH_BARS_ID);
   public static final RegistryObject<IronBarsBlock> CRIMSON_BARS = registerBlock("crimson_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, CRIMSON_BARS_ID);
   public static final RegistryObject<WoodenBarsBlock> DARK_OAK_BARS = registerWoodenBlock("dark_oak_bars", () -> new WoodenBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 150, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DARK_OAK_BARS_ID);
   public static final RegistryObject<WoodenBarsBlock> JUNGLE_BARS = registerWoodenBlock("jungle_bars", () -> new WoodenBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 150, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, JUNGLE_BARS_ID);
   public static final RegistryObject<WoodenBarsBlock> OAK_BARS = registerWoodenBlock("oak_bars", () -> new WoodenBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 150, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, OAK_BARS_ID);
   public static final RegistryObject<WoodenBarsBlock> SPRUCE_BARS = registerWoodenBlock("spruce_bars", () -> new WoodenBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 150, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SPRUCE_BARS_ID);
   public static final RegistryObject<IronBarsBlock> WARPED_BARS = registerBlock("warped_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, WARPED_BARS_ID);
   public static final RegistryObject<IronBarsBlock> DIAMOND_BARS = registerBlock("diamond_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(4.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DIAMOND_BARS_ID);
   public static final RegistryObject<IronBarsBlock> GOLD_BARS = registerBlock("gold_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_BARS_ID);

   public static final RegistryObject<WoodenGrateBlock> ACACIA_GRATE = registerWoodenBlock("acacia_grate", () -> new WoodenGrateBlock(BlockBehaviour.Properties.copy(BlockInit.ACACIA_BARS.get())), 160, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, ACACIA_GRATE_ID);
   public static final RegistryObject<WoodenGrateBlock> BIRCH_GRATE = registerWoodenBlock("birch_grate", () -> new WoodenGrateBlock(BlockBehaviour.Properties.copy(BlockInit.BIRCH_BARS.get())), 160, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BIRCH_GRATE_ID);
   public static final RegistryObject<GrateBlock> CRIMSON_GRATE = registerBlock("crimson_grate", () -> new GrateBlock(BlockBehaviour.Properties.copy(BlockInit.CRIMSON_BARS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, CRIMSON_GRATE_ID);
   public static final RegistryObject<WoodenGrateBlock> DARK_OAK_GRATE = registerWoodenBlock("dark_oak_grate", () -> new WoodenGrateBlock(BlockBehaviour.Properties.copy(BlockInit.DARK_OAK_BARS.get())), 160, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DARK_OAK_GRATE_ID);
   public static final RegistryObject<WoodenGrateBlock> JUNGLE_GRATE = registerWoodenBlock("jungle_grate", () -> new WoodenGrateBlock(BlockBehaviour.Properties.copy(BlockInit.JUNGLE_BARS.get())), 160, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, JUNGLE_GRATE_ID);
   public static final RegistryObject<WoodenGrateBlock> OAK_GRATE = registerWoodenBlock("oak_grate", () -> new WoodenGrateBlock(BlockBehaviour.Properties.copy(BlockInit.OAK_BARS.get())), 160, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, OAK_GRATE_ID);
   public static final RegistryObject<WoodenGrateBlock> SPRUCE_GRATE = registerWoodenBlock("spruce_grate", () -> new WoodenGrateBlock(BlockBehaviour.Properties.copy(BlockInit.SPRUCE_BARS.get())), 160, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SPRUCE_GRATE_ID);
   public static final RegistryObject<GrateBlock> WARPED_GRATE = registerBlock("warped_grate", () -> new GrateBlock(BlockBehaviour.Properties.copy(BlockInit.WARPED_BARS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, WARPED_GRATE_ID);
   public static final RegistryObject<GrateBlock> GOLD_GRATE = registerBlock("gold_grate", () -> new GrateBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_BARS.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_GRATE_ID);
   public static final RegistryObject<GrateBlock> IRON_GRATE = registerBlock("iron_grate", () -> new GrateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_GRATE_ID);
			
/* Benches */
   public static final RegistryObject<WoodenBenchBlock> ACACIA_BENCH = registerWoodenBlock("acacia_bench", () -> new WoodenBenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.ACACIA_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 300, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, ACACIA_BENCH_ID);
   public static final RegistryObject<WoodenBenchBlock> BIRCH_BENCH = registerWoodenBlock("birch_bench", () -> new WoodenBenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.BIRCH_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 300, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BIRCH_BENCH_ID);
   public static final RegistryObject<BenchBlock> CRIMSON_BENCH = registerBlock("crimson_bench", () -> new BenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, CRIMSON_BENCH_ID);
   public static final RegistryObject<WoodenBenchBlock> DARK_OAK_BENCH = registerWoodenBlock("dark_oak_bench", () -> new WoodenBenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.DARK_OAK_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 300, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DARK_OAK_BENCH_ID);
   public static final RegistryObject<WoodenBenchBlock> JUNGLE_BENCH = registerWoodenBlock("jungle_bench", () -> new WoodenBenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.JUNGLE_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 300, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, JUNGLE_BENCH_ID);
   public static final RegistryObject<WoodenBenchBlock> OAK_BENCH = registerWoodenBlock("oak_bench", () -> new WoodenBenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 300, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, OAK_BENCH_ID);
   public static final RegistryObject<WoodenBenchBlock> SPRUCE_BENCH = registerWoodenBlock("spruce_bench", () -> new WoodenBenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.SPRUCE_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), 300, MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SPRUCE_BENCH_ID);
   public static final RegistryObject<BenchBlock> WARPED_BENCH = registerBlock("warped_bench", () -> new BenchBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.WARPED_PLANKS.defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, WARPED_BENCH_ID);
   public static final RegistryObject<BenchBlock> GOLD_BENCH = registerBlock("gold_bench", () -> new BenchBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_BENCH_ID);
   public static final RegistryObject<BenchBlock> IRON_BENCH = registerBlock("iron_bench", () -> new BenchBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_BENCH_ID);

/* Books */
   public static final RegistryObject<PileOfBooksBlock> STACKED_BOOKS = registerBlock("stacked_books", () -> new PileOfBooksBlock(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_BROWN).instabreak().sound(SoundType.WOOL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, STACKED_BOOKS_ID);

/* Braziers */
   public static final RegistryObject<BrazierBlock> GOLD_BRAZIER = registerBlock("gold_brazier", () -> new BrazierBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_BRAZIER_ID);
   public static final RegistryObject<BrazierBlock> IRON_BRAZIER = registerBlock("iron_brazier", () -> new BrazierBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_BRAZIER_ID);
   public static final RegistryObject<BrazierBlock> SOUL_GOLD_BRAZIER = registerBlock("soul_gold_brazier", () -> new BrazierBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_BRAZIER.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SOUL_GOLD_BRAZIER_ID);
   public static final RegistryObject<BrazierBlock> SOUL_IRON_BRAZIER = registerBlock("soul_iron_brazier", () -> new BrazierBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_BRAZIER.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SOUL_IRON_BRAZIER_ID);
   
   public static final RegistryObject<FireBowlBlock> GOLD_FIRE_BOWL = registerBlock("gold_fire_bowl", () -> new FireBowlBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_BRAZIER.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_FIRE_BOWL_ID);
   public static final RegistryObject<FireBowlBlock> IRON_FIRE_BOWL = registerBlock("iron_fire_bowl", () -> new FireBowlBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_BRAZIER.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_FIRE_BOWL_ID);
   public static final RegistryObject<FireBowlBlock> SOUL_GOLD_FIRE_BOWL = registerBlock("soul_gold_fire_bowl", () -> new FireBowlBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_BRAZIER.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SOUL_GOLD_FIRE_BOWL_ID);
   public static final RegistryObject<FireBowlBlock> SOUL_IRON_FIRE_BOWL = registerBlock("soul_iron_fire_bowl", () -> new FireBowlBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_BRAZIER.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, SOUL_IRON_FIRE_BOWL_ID);

/* Candles */
   public static final RegistryObject<CandelabraBlock> BONE_TWO_ARM_CANDELABRA = registerBlock("bone_two_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BONE_TWO_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> BONE_THREE_ARM_CANDELABRA = registerBlock("bone_three_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.BONE_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BONE_THREE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> BONE_FIVE_ARM_CANDELABRA = registerBlock("bone_five_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.BONE_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BONE_FIVE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> BONE_SEVEN_ARM_CANDELABRA = registerBlock("bone_seven_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.BONE_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BONE_SEVEN_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> DIAMOND_TWO_ARM_CANDELABRA = registerBlock("diamond_two_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(4.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DIAMOND_TWO_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> DIAMOND_THREE_ARM_CANDELABRA = registerBlock("diamond_three_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.DIAMOND_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DIAMOND_THREE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> DIAMOND_FIVE_ARM_CANDELABRA = registerBlock("diamond_five_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.DIAMOND_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DIAMOND_THREE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> DIAMOND_SEVEN_ARM_CANDELABRA = registerBlock("diamond_seven_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.DIAMOND_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DIAMOND_SEVEN_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> GOLD_TWO_ARM_CANDELABRA = registerBlock("gold_two_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_TWO_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> GOLD_THREE_ARM_CANDELABRA = registerBlock("gold_three_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_THREE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> GOLD_FIVE_ARM_CANDELABRA = registerBlock("gold_five_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_FIVE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> GOLD_SEVEN_ARM_CANDELABRA = registerBlock("gold_seven_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_SEVEN_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> IRON_TWO_ARM_CANDELABRA = registerBlock("iron_two_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_TWO_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> IRON_THREE_ARM_CANDELABRA = registerBlock("iron_three_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_THREE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> IRON_FIVE_ARM_CANDELABRA = registerBlock("iron_five_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_FIVE_ARM_CANDELABRA_ID);
   public static final RegistryObject<CandelabraBlock> IRON_SEVEN_ARM_CANDELABRA = registerBlock("iron_seven_arm_candelabra", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_SEVEN_ARM_CANDELABRA_ID);

   public static final RegistryObject<CandelabraBlock> BONE_CANDLE_STAND = registerBlock("bone_candle_stand", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.BONE_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BONE_CANDLE_STAND_ID);
   public static final RegistryObject<CandelabraBlock> BONE_SKULL_CANDLE_STAND = registerBlock("bone_skull_candle_stand", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.BONE_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BONE_SKULL_CANDLE_STAND_ID);
   public static final RegistryObject<CandelabraBlock> DIAMOND_CANDLE_STAND = registerBlock("diamond_candle_stand", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.DIAMOND_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, DIAMOND_CANDLE_STAND_ID);
   public static final RegistryObject<CandelabraBlock> GOLD_CANDLE_STAND = registerBlock("gold_candle_stand", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.GOLD_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_CANDLE_STAND_ID);
   public static final RegistryObject<CandelabraBlock> IRON_CANDLE_STAND = registerBlock("iron_candle_stand", () -> new CandelabraBlock(BlockBehaviour.Properties.copy(BlockInit.IRON_TWO_ARM_CANDELABRA.get())), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_CANDLE_STAND_ID);
   
   public static final RegistryObject<LargeCandleBlock> LARGE_CANDLE = registerBlock("large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.SAND).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> WHITE_LARGE_CANDLE = registerBlock("white_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.WOOL).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> ORANGE_LARGE_CANDLE = registerBlock("orange_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_ORANGE).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, ORANGE_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> MAGENTA_LARGE_CANDLE = registerBlock("magenta_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_MAGENTA).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, MAGENTA_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> LIGHT_BLUE_LARGE_CANDLE = registerBlock("light_blue_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_BLUE).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LIGHT_BLUE_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> YELLOW_LARGE_CANDLE = registerBlock("yellow_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_YELLOW).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, YELLOW_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> LIME_LARGE_CANDLE = registerBlock("lime_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_GREEN).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LIME_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> PINK_LARGE_CANDLE = registerBlock("pink_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PINK).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, PINK_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> GRAY_LARGE_CANDLE = registerBlock("gray_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_GRAY).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GRAY_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> LIGHT_GRAY_LARGE_CANDLE = registerBlock("light_gray_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_GRAY).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LIGHT_GRAY_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> CYAN_LARGE_CANDLE = registerBlock("cyan_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_CYAN).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, CYAN_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> PURPLE_LARGE_CANDLE = registerBlock("purple_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PURPLE).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, PURPLE_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> BLUE_LARGE_CANDLE = registerBlock("blue_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLUE).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BLUE_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> BROWN_LARGE_CANDLE = registerBlock("brown_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BROWN).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BROWN_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> GREEN_LARGE_CANDLE = registerBlock("green_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_GREEN).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GREEN_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> RED_LARGE_CANDLE = registerBlock("red_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, RED_LARGE_CANDLE_ID);
   public static final RegistryObject<LargeCandleBlock> BLACK_LARGE_CANDLE = registerBlock("black_large_candle", () -> new LargeCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLACK).noOcclusion().strength(0.2F).sound(SoundType.CANDLE).lightLevel(LargeCandleBlock.LIGHT_EMISSION)), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BLACK_LARGE_CANDLE_ID);

   
/* Statues */   
   public static final RegistryObject<StatueHoldingCandle> GOLD_ANGEL_STATUE_HOLDING_CANDELABRA = registerBlock("gold_angel_statue_holding_candelabra", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_ANGEL_STATUE_HOLDING_CANDELABRA_ID);
   public static final RegistryObject<StatueHoldingCandle> GOLD_MAN_STATUE_HOLDING_CANDLE = registerBlock("gold_man_statue_holding_candle", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_MAN_STATUE_HOLDING_CANDLE_ID);
   public static final RegistryObject<StatueHoldingCandle> GOLD_VILLAGER_STATUE_HOLDING_CANDLE = registerBlock("gold_villager_statue_holding_candle", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GOLD_MAN_STATUE_HOLDING_CANDLE_ID);
   public static final RegistryObject<StatueHoldingCandle> IRON_ANGEL_STATUE_HOLDING_CANDELABRA = registerBlock("iron_angel_statue_holding_candelabra", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, IRON_ANGEL_STATUE_HOLDING_CANDELABRA_ID);
   public static final RegistryObject<StatueHoldingCandle> STONE_ANGEL_STATUE_HOLDING_CANDELABRA = registerBlock("stone_angel_statue_holding_candelabra", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, STONE_ANGEL_STATUE_HOLDING_CANDELABRA_ID);
   public static final RegistryObject<StatueHoldingCandle> STONE_MAN_STATUE_HOLDING_CANDLE = registerBlock("stone_man_statue_holding_candle", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, STONE_MAN_STATUE_HOLDING_CANDLE_ID);
   public static final RegistryObject<StatueHoldingCandle> STONE_VILLAGER_STATUE_HOLDING_CANDLE = registerBlock("stone_villager_statue_holding_candle", () -> new StatueHoldingCandle(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F, 6.0F).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, STONE_VILLAGER_STATUE_HOLDING_CANDLE_ID);

   
/* Vases */   
   public static final RegistryObject<GlassVaseCandleholderBlock> GLASS_VASE_CANDLEHOLDER = registerBlock("glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> WHITE_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("white_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.WHITE).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, WHITE_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> ORANGE_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("orange_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.ORANGE).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, ORANGE_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> MAGENTA_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("magenta_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.MAGENTA).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, MAGENTA_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> LIGHT_BLUE_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("light_blue_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.LIGHT_BLUE).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LIGHT_BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> YELLOW_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("yellow_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.YELLOW).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, YELLOW_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> LIME_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("lime_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.LIME).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LIME_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> PINK_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("pink_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.PINK).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, PINK_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> GRAY_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("gray_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.GRAY).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> LIGHT_GRAY_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("light_gray_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.LIGHT_GRAY).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, LIGHT_GRAY_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> CYAN_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("cyan_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.CYAN).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, CYAN_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> PURPLE_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("purple_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.PURPLE).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, PURPLE_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> BLUE_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("blue_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.BLUE).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BLUE_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> BROWN_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("brown_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.BROWN).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BROWN_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> GREEN_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("green_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.GREEN).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, GREEN_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> RED_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("red_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.RED).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, RED_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> BLACK_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("black_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS, DyeColor.BLACK).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, BLACK_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
   public static final RegistryObject<GlassVaseCandleholderBlock> MOSAIC_STAINED_GLASS_VASE_CANDLEHOLDER = registerBlock("mosaic_stained_glass_vase_candleholder", () -> new GlassVaseCandleholderBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion()), MedievalDecorations.MEDIEVAL_DECORATIONS_TAB, MOSAIC_STAINED_GLASS_VASE_CANDLEHOLDER_ID);
	
   
   
   
	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
		return BLOCKS.register(name, block);
	}

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<? extends T> block, CreativeModeTab tab, String id) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab, id);
		return toReturn;
	}
	
	private static <T extends Block> RegistryObject<T> registerWoodenBlock(String name, Supplier<? extends T> block, int burnTime, CreativeModeTab tab, String id) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerWoodenBlockItem(name, toReturn, burnTime, tab, id);
		return toReturn;
	}
	
	private static <T extends Block> RegistryObject<T> registerMosaicGlassBlock(String name, Supplier<? extends T> block, CreativeModeTab tab, String color, String id) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerMosaicGlassBlockItem(name, toReturn, tab, color, id);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String id) {
		return registerItem(block.getId().getPath(), () -> new BlockItem(block.get(), (new Item.Properties()).tab(tab)));

	}
	
	private static <T extends Block> RegistryObject<Item> registerWoodenBlockItem(String name, RegistryObject<T> block, int burnTime, CreativeModeTab tab, String id) {
		return registerItem(block.getId().getPath(), () -> new WoodenBlockItem(block.get(), (new Item.Properties()).tab(tab), burnTime));
		
	}
	
	private static <T extends Block> RegistryObject<Item> registerMosaicGlassBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String color, String id) {
		return registerItem(block.getId().getPath(), () -> new BlockItem(block.get(), (new Item.Properties()).tab(tab)));
		
	}

	public static RegistryObject<Item> registerItem(String name, Supplier<? extends Item> sup) {
        return ItemInit.ITEMS.register(name, sup);
    }

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
