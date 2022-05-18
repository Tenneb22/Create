package com.simibubi.create.content.logistics.trains;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.foundation.tileEntity.renderer.SafeTileEntityRenderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class IBogeyTileEntityRenderer<T extends BlockEntity> extends SafeTileEntityRenderer<T> {

	public IBogeyTileEntityRenderer(BlockEntityRendererProvider.Context context) {}

	@Override
	protected void renderSafe(T te, float partialTicks, PoseStack ms, MultiBufferSource buffer, int light,
		int overlay) {
		BlockState blockState = te.getBlockState();
		if (blockState.getBlock()instanceof IBogeyBlock bogey) 
			bogey.render(blockState, 0, ms, partialTicks, buffer, light, overlay);
	}

}
