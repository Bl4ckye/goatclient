package de.bl4ckye.client.gui.screens;

import com.mojang.blaze3d.vertex.PoseStack;
import de.bl4ckye.client.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.MultiLineLabel;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;

public class WelcomeScreen extends Screen {

    private MultiLineLabel message;

    public WelcomeScreen() {
        super(Component.literal("Welcome, " + (Client.minecraft.getUser().getName())));
    }

    protected void init()
    {
        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 4 + 120 + 12, 150, 20, Component.translatable("gui.toTitle"), (p_96304_) ->
        {
            this.minecraft.setScreen(new TitleScreen());
        }));
        this.addRenderableWidget(new Button(this.width / 2 - 155 + 160, this.height / 4 + 120 + 12, 150, 20, Component.translatable("menu.quit"), (p_96300_) ->
        {
            this.minecraft.stop();
        }));
        this.message = MultiLineLabel.create(this.font, Component.translatable("This is the Goat Client version " + Client.versionStatus + " " + Client.currentVersion + ". Have fun! You are an " + Client.versionStatus + " tester!! Enjoy it!  Report Bugs on our Discord!"), 295);

    }

    public boolean shouldCloseOnEsc()
    {
        return false;
    }

    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick)
    {
        this.renderBackground(pPoseStack);
        drawCenteredString(pPoseStack, this.font, this.title, this.width / 2, this.height / 4 - 60 + 20, 16777215);
        this.message.renderLeftAligned(pPoseStack, this.width / 2 - 145, this.height / 4, 9, 10526880);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
    }
}
