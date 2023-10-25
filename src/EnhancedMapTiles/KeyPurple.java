package EnhancedMapTiles;


import Engine.GraphicsHandler;
import Engine.ImageLoader;
import EnhancedMapTiles.KeyPurple;
import GameObject.Sprite;
import GameObject.SpriteSheet;
import SpriteFont.SpriteFont;
import java.awt.*;
import java.awt.image.BufferedImage;
import Builders.FrameBuilder;
import GameObject.Frame;
import GameObject.GameObject;
import Level.HealthMeter;
import Level.EnhancedMapTile;
import Level.Map;
import Level.Player;
import Level.PlayerState;
import Level.TileType;
import Maps.TestMap;
import Utils.Direction;
import Utils.Point;


public class KeyPurple extends EnhancedMapTile{
    public int collectedItems;
    protected Map map;
    private boolean hasInteracted = false;

    public KeyPurple(Point location)
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),15, 17), TileType.PASSABLE);

    }
     
    public KeyPurple(Point location, Map map) 
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),15, 17), TileType.PASSABLE);
        this.map = map;
    }
    

    public void itemCollected () { 
        collectedItems = collectedItems + 1;
        update();

        if (collectedItems == 4)
        { 
            System.out.println("4 items have been collected");
        }
    }

    @Override
    public void update(Player player) {
        super.update(player);
        
        if (player.overlaps(this) && !hasInteracted)
        {
        	map.setHasChangedHealthMeter(true);
            hasInteracted = true;
            this.isHidden = true;
            this.map.getCheckList().itemCollected();
        }
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(0.5f)
                .build();
        		
        return new GameObject(x+12, y, frame);
    }
}

    
    

// public KeyPurple(Point location) {
    //     super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),92, 261), TileType.PASSABLE);
    // } 

    // public KeyPurple(Point location, Map map) {
    //     super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),92, 261), TileType.PASSABLE);
    //     this.map = map;
    // }

    // @Override
    // protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
    //     Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
    //             .withScale(0.2f)
    //             .build();
        		
    //     return new GameObject(x+12, y, frame);

    // this.map.getCheckList().itemCollected();
