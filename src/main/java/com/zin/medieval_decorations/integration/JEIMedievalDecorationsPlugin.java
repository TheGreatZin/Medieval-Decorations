package com.zin.medieval_decorations.integration;

import com.zin.medieval_decorations.MedievalDecorations;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIMedievalDecorationsPlugin implements IModPlugin {

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(MedievalDecorations.MOD_ID, "jei_plugin");
	}
	
}
