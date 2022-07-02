package com.zin.medieval_decorations.core.init;

import com.zin.medieval_decorations.MedievalDecorations;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class SoundInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			MedievalDecorations.MOD_ID);
	
	
	private SoundInit() {}

}
