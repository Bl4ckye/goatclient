/* private ICape cape;


 private Touch<ICape> touch;

 public CapeManager init(){
     touch = new Touch<>();
     setCape(pixelcape.class);
     return this;
 }

 public void setCape(Class<?> clazz){
     try {
         cape = touch.touch(clazz);
     } catch (Exception e){
         e.printStackTrace();
     }
 }


 public void reset(){
     setCape(ResetCape.class);
 }

 private int i = 0;


 public void tick(){
     assert Client.minecraft.player != null;
     assert cape != null;
     AbstractClientPlayer player = Client.minecraft.player;
     SimpleTexture texture = new SimpleTexture(cape.getCape());
     ResourceLocation resourceLocation = new ResourceLocation("cosmetics/pixelcape.png");
     Config.getTextureManager().register(resourceLocation, texture);
     player.setLocationOfCape(resourceLocation);
 }*/
package de.bl4ckye.client.cosmetics.capes.normal;

import de.bl4ckye.client.Client;
import de.bl4ckye.client.cosmetics.capes.ICape;
import de.bl4ckye.client.cosmetics.capes.ResetCape;
import de.bl4ckye.client.utils.Touch;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.resources.ResourceLocation;
import net.optifine.Config;

public class CapeManager {



    private ICape cape;
    private Touch<ICape> touch;
    public CapeManager init(){
        touch = new Touch<>();
        setCape(AnimeCape.class);
        return this;
    }
    public void setCape(Class<?> clazz) {
        try {
            cape = touch.touch(clazz);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void reset(){
        setCape(ResetCape.class);
    }

    public void tick(){
        assert Client.minecraft.player != null;
        assert cape != null;
        AbstractClientPlayer player = Client.minecraft.player;
        SimpleTexture texture = new SimpleTexture(cape.getCape());
        ResourceLocation resourceLocation = new ResourceLocation("cosmetics/cape");
        Config.getTextureManager().register(resourceLocation, texture);
        player.setLocationOfCape(resourceLocation);
    }

}
