package EnhancedMapTiles;

import java.awt.image.BufferedImage;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Sprite;

public class LockedSymbol {

    public String name; 
    public String image; 
    private Sprite lockedSymbol;

    public LockedSymbol(String name) { 
        this.name = name;

        BufferedImage lockedSymbolImage = ImageLoader.load("lockedSymbol.png");
        lockedSymbol = new Sprite(lockedSymbolImage, 77, 77);
        lockedSymbol.setScale(.04f);
    }

        public void draw(GraphicsHandler graphicsHandler) { 
            lockedSymbol.draw(graphicsHandler);
    }
}