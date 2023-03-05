package de.bl4ckye.client;

import de.bl4ckye.client.cosmetics.CosmeticsManager;
import de.bl4ckye.client.gui.overlays.FPSOverlay;
import de.bl4ckye.client.gui.overlays.OverlayManager;
import de.bl4ckye.client.servers.FeaturedServerData;
import de.bl4ckye.discord.RPC;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;

public class Client {

    public static boolean initialized = false;


    public static Minecraft minecraft;
    public static OverlayManager overlayManager;
    public static CosmeticsManager cosmeticsManager;


    public static String websiteUrl = "https://goatclient.de";
    public static String Discord = "https://dsc.gg/goatclient";
    //public static String commingSoon = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    //public static CompoundTag overlayConfig;
    public static String currentVersion = "g23w1b";
    public static String versionStatus = "SNAPSHOT";





    public static void init(Minecraft minecraft){
       Client.minecraft = minecraft;
       overlayManager = new OverlayManager().init();
       overlayManager.showOverlay(FPSOverlay.class);
       overlayManager.hideOverlay(FPSOverlay.class);
       cosmeticsManager = new CosmeticsManager().init();
       //minecraft.setScreen(new WelcomeScreen());
       initialized = true;

    }

    public static boolean isFeaturedServer(ServerData data){
        return (data instanceof FeaturedServerData);
    }

    public static void tick(){
        if(minecraft.level != null){
            cosmeticsManager.getCapeManager().tick();
            overlayManager.showOverlay(FPSOverlay.class);
        }
        else {
            overlayManager.hideOverlay(FPSOverlay.class);
        }
    }


    public static void resetRPC(){
        RPC.instance().update("Main Menu","","","");
    }


    public static boolean isInitialized(){
        return initialized;
    }

}
