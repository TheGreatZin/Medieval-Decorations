package com.zin.medieval_decorations.core.init;

import com.zin.medieval_decorations.MedievalDecorations;
import com.zin.medieval_decorations.common.entity.SittableEntity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			MedievalDecorations.MOD_ID);

	public static final RegistryObject<EntityType<SittableEntity>> SEAT = register("seat",
			EntityType.Builder.<SittableEntity>of((type, world) -> new SittableEntity(world), MobCategory.MISC)
					.sized(0.0F, 0.0F).setCustomClientFactory((spawnEntity, world) -> new SittableEntity(world)));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String name,
			EntityType.Builder<T> builder) {
		return ENTITIES.register(name, () -> builder.build(name));
	}

}
