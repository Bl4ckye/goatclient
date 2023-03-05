package de.bl4ckye.client.gui.screens;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;

import de.bl4ckye.client.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.components.LockIconButton;
import net.minecraft.client.gui.screens.*;
import net.minecraft.client.gui.screens.controls.ControlsScreen;
import net.minecraft.client.gui.screens.packs.PackSelectionScreen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ServerboundChangeDifficultyPacket;
import net.minecraft.network.protocol.game.ServerboundLockDifficultyPacket;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.world.Difficulty;

public class CosmeticsScreen extends Screen
{
    private final Screen lastScreen;
    private final Options options;
    private CycleButton<Difficulty> difficultyButton;
    private LockIconButton lockButton;

    public CosmeticsScreen(Screen pLastScreen, Options pOptions)
    {
        super(Component.translatable("Cosmetics"));
        this.lastScreen = pLastScreen;
        this.options = pOptions;
    }

    protected void init()
    {
        int i = 0;


        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, Component.translatable("Capes"), (p_96276_) ->
        {
            this.minecraft.setScreen(new CapeSelectScreen(this, this.options));
        }));
//        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 48 - 6, 150, 20, Component.translatable("FPS = Blau"), (p_96274_) ->
  //      {
    //    }));
//        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, Component.translatable("options.video"), (p_96272_) ->
//        {
//            this.minecraft.setScreen(new VideoSettingsScreen(this, this.options));
//        }));
//        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, Component.translatable("options.controls"), (p_96270_) ->
//        {
//            this.minecraft.setScreen(new ControlsScreen(this, this.options));
//        }));
//        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 96 - 6, 150, 20, Component.translatable("options.language"), (p_96268_) ->
//        {
//            this.minecraft.setScreen(new LanguageSelectScreen(this, this.options, this.minecraft.getLanguageManager()));
//        }));
//        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 96 - 6, 150, 20, Component.translatable("options.chat.title"), (p_96266_) ->
//        {
//            this.minecraft.setScreen(new ChatOptionsScreen(this, this.options));
//        }));
//        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 120 - 6, 150, 20, Component.translatable("options.resourcepack"), (p_96263_) ->
//        {
//            this.minecraft.setScreen(new PackSelectionScreen(this, this.minecraft.getResourcePackRepository(), this::updatePackList, this.minecraft.getResourcePackDirectory(), Component.translatable("resourcePack.title")));
//        }));
//        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 120 - 6, 150, 20, Component.translatable("options.accessibility.title"), (p_96259_) ->
//        {
//            this.minecraft.setScreen(new AccessibilityOptionsScreen(this, this.options));
//        }));
        this.addRenderableWidget(new Button(this.width / 2 - 100, this.height / 6 + 168, 200, 20, CommonComponents.GUI_DONE, (p_96257_) ->
        {
            this.minecraft.setScreen(this.lastScreen);
        }));
    }

    private void updatePackList(PackRepository packRepository) {
    }


    public void render(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick)
    {
        this.renderBackground(pPoseStack);
        drawCenteredString(pPoseStack, this.font, this.title, this.width / 2, 15, 16777215);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
    }
}
