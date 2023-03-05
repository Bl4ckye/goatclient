package de.bl4ckye.client.gui.screens;

import com.mojang.blaze3d.vertex.PoseStack;
import de.bl4ckye.client.Client;
import de.bl4ckye.client.cosmetics.capes.normal.goatv1;
import de.bl4ckye.client.cosmetics.capes.normal.partner.EgCape;
import de.bl4ckye.client.cosmetics.capes.normal.AnimeCape;
import de.bl4ckye.client.cosmetics.capes.normal.partner.TGPv1;
import net.minecraft.client.Options;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.components.LockIconButton;
import net.minecraft.client.gui.screens.*;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.world.Difficulty;

public class CapeSelectScreen extends Screen
{
    private final Screen lastScreen;
    private final Options options;
    private CycleButton<Difficulty> difficultyButton;
    private LockIconButton lockButton;

    public CapeSelectScreen(Screen pLastScreen, Options pOptions)
    {
        super(Component.translatable("Cosmetics"));
        this.lastScreen = pLastScreen;
        this.options = pOptions;
    }

    protected CapeSelectScreen(Component pTitle, Screen lastScreen, Options options) {
        super(pTitle);
        this.lastScreen = lastScreen;
        this.options = options;
    }

    protected void init()
    {
        int i = 0;


        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, Component.translatable("Goat v1"), (p_96276_) ->
        {
            Client.cosmeticsManager.getCapeManager().setCape(goatv1.class);
            this.minecraft.setScreen((Screen)null);
        }));
        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 48 - 6, 150, 20, Component.translatable("Anime v1"), (p_96276_) ->
        {
            Client.cosmeticsManager.getCapeManager().setCape(AnimeCape.class);
            this.minecraft.setScreen((Screen)null);
        }));

        int k = 0;
       // this.addRenderableWidget(new ImageButton(this.width / 2 - 124, k + 82 + 12, 20, 20, 0, 106, 20, Button.ArrowRight_LOCATION, 256, 256, (p_96790_1_) ->
        //{

       // }, Component.translatable("narrator.button.language")));

      //  this.addRenderableWidget(new ImageButton(this.width / 2 - 124, k + 82 + 12, 20, 20, 0, 106, 20, Button.ArrowRight_LOCATION, 256, 256, (p_96790_1_) ->
      //  {
//
      //  }, Component.translatable("narrator.button.language")));
        this.addRenderableWidget(new Button(this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, Component.translatable("ErdnussGaming"), (p_96274_) ->
        {
            Client.cosmeticsManager.getCapeManager().setCape(EgCape.class);
            this.minecraft.setScreen((Screen)null);
        }));
        this.addRenderableWidget(new Button(this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, Component.translatable("TGP-v1"), (p_96272_) ->
        {
            Client.cosmeticsManager.getCapeManager().setCape(TGPv1.class);
            this.minecraft.setScreen((Screen)null);
        }));
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
