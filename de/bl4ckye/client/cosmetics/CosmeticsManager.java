package de.bl4ckye.client.cosmetics;

import de.bl4ckye.client.cosmetics.capes.normal.CapeManager;

public class CosmeticsManager {


    private CapeManager capeManager;

    /*public CosmeticsManager init(){
        this.capeManager = new CapeManager().init();
        return this;
    }*/

    public CosmeticsManager init(){
        this.capeManager = new CapeManager().init();
        return this;
    }

    public CapeManager getCapeManager(){
        return capeManager;
    }

}
