package com.zin.medieval_decorations.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
	public static ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static ForgeConfigSpec COMMON_SPEC;


	static {
		BUILDER.push("Configs for Medieval Decorations, reload is required for changes to take effect");
		BUILDER.pop();
		COMMON_SPEC = BUILDER.build();
	}

}
