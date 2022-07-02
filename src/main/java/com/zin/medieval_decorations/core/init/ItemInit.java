package com.zin.medieval_decorations.core.init;

import java.util.function.Supplier;

import com.zin.medieval_decorations.MedievalDecorations;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
    		MedievalDecorations.MOD_ID);
	
    public static final RegistryObject<Item> MEDIEVAL_DECORATIONS_LOGO = register("logo", () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));    

	
	private static <T extends Item> RegistryObject<Item> register(final String name, final Supplier<T> item) {
    	return ITEMS.register(name, item);
    }
	
}
