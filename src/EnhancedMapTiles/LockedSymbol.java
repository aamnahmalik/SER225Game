package EnhancedMapTiles;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Engine.GraphicsHandler;
import Engine.ImageLoader;
import EnhancedMapTiles.FirstAidKit;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.Water;
import EnhancedMapTiles.Weapon;
import GameObject.Sprite;
import GameObject.SpriteSheet;
import Level.Map;
import Level.Player;
import Level.TileType;
import Utils.ImageUtils;
import Utils.Point;
import Maps.TestMap;

public class LockedSymbol {

    public String name; 
    public String image; 
    private ImageUtils imageToRemove;
    private int inventoryCountToRemove =1;
    private boolean isHidden = false;
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

    // List<CollectibleItems> inventory = new ArrayList<>();
    // {

    // if (inventory.size() >= inventoryCountToRemove) { 
    //     removeImage(imageToRemove);
    // }

    // int itemsToCollect = inventory.size(); 
    // imageToRemove.isHidden = true;

    // public void removeImage() { 
    //     if (inventory.size() >= inventoryCountToRemove){
    //         //remove image here 
    //     }
    // }
    
    // @Override
    // public void update(Player player) {
    //     //checking for player interaction
    //     if(player.overlaps(this)) { 
    //         isHidden = true;
    //     }
        
    //         }
    // }
    // Class CollectibleItems { 
        
    // }



