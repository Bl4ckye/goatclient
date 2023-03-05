package de.bl4ckye.client.gui.overlays;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.Font;

public interface IOverlay {
    void render(PoseStack pPoseStack, Font font, int pMouseX, int pMoseY, float pPartialTick);
}
