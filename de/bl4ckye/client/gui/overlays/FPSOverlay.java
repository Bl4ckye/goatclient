package de.bl4ckye.client.gui.overlays;

import com.mojang.blaze3d.vertex.PoseStack;
import de.bl4ckye.client.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.optifine.Config;

public class FPSOverlay implements IOverlay {

    public void render(PoseStack pPoseStack, Font font, int pMouseX, int pMouseY, float pPartialTick) {
        String fps = "§4§lFPS: §3§l" + Config.getFpsString();
        /*float pX = (float) Client.overlayConfig.getDouble("overlay.fps.x");
        float pY = (float) Client.overlayConfig.getDouble("overlay.fps.y");*/
        font.draw(pPoseStack, fps, 10.0F, 10.0F, 1048575);
    }

}