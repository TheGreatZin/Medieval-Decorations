package com.zin.medieval_decorations.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.zin.medieval_decorations.common.entity.SittableEntity;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class SeatRenderer extends EntityRenderer<SittableEntity> {
	public SeatRenderer(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	public ResourceLocation getTextureLocation(SittableEntity SittableEntity) {
		return null;
	}

	@Override
	protected void renderNameTag(SittableEntity entity, Component component, PoseStack stack, MultiBufferSource source,
			int light) {
	}
}
