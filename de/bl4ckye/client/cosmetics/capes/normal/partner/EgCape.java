package de.bl4ckye.client.cosmetics.capes.normal.partner;

import de.bl4ckye.client.cosmetics.capes.ICape;
import net.minecraft.resources.ResourceLocation;

public class EgCape implements ICape {

    @Override
    public ResourceLocation getCape() {
        return new ResourceLocation("cosmetics/egcape.png");
    }
}
