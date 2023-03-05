package de.bl4ckye.client.servers;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.resources.ResourceLocation;

public class FeaturedServerData extends ServerData {

    public static final ResourceLocation ICON = new ResourceLocation("goatclient/gui/title/icons/star.png");

    public FeaturedServerData(String pName, String pIp) {
        super(pName, pIp, false);
    }
}
