package de.bl4ckye.client.gui.screens;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Options;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.components.LockIconButton;
import net.minecraft.client.gui.screens.*;
import net.minecraft.client.gui.screens.controls.ControlsScreen;
import net.minecraft.client.gui.screens.packs.PackSelectionScreen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.world.Difficulty;

public class GC_SettingsScreen extends Screen
{
    private final Screen lastScreen;
    private final Options options;
    private CycleButton<Difficulty> difficultyButton;
    private LockIconButton lockButton;

    public GC_SettingsScreen(Screen pLastScreen, Options pOptions)
    {
        super(Component.translatable("Goat Client Settings"));
        this.lastScreen = pLastScreen;
        this.options = pOptions;
    }

    protected void init()
    {
        int i = 0;

//        for (OptionInstance<?> optioninstance : new OptionInstance[] {this.options.fov()})
//        {
//            int j = this.width / 2 - 155 + i % 2 * 160;
//            int k = this.height / 6 - 12 + 24 * (i >> 1);
//            this.addRenderableWidget(optioninstance.createButton(this.minecraft.options, j, k, 150));
//            ++i;
//        }


        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, Component.literal("Cosmetics"), (p_96276_) ->
        {
            this.minecraft.setScreen(new CosmeticsScreen(this, this.options));
        }));
        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 48 - 6, 150, 20, Component.literal("Add-ons"), (p_96274_) ->
       {

      }));
        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, Component.literal("Mods"), (p_96272_) ->
       {

      }));
        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, Component.translatable("Custom RPC"), (p_96270_) ->
        {

        }));
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
