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
import Level.CheckList;
import Maps.TestMap;
import Utils.Direction;
import Utils.Point;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.Water;
import EnhancedMapTiles.Weapon;
import EnhancedMapTiles.FirstAidKit;


public class Checkmark extends EnhancedMapTile{
    public int collectedWater;
    protected Map map;
    private boolean hasInteracted = false;
    protected CheckList checklist;
    public int keyCollected;

    @Override
    public void update() {
        super.update();
        waterCollected();
    }
    public Checkmark(Point location)
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),17, 17), TileType.PASSABLE);
    }
     
    public Checkmark(Point location, Map map) 
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),17, 17), TileType.PASSABLE);
        this.map = map;
        this.checklist = this.map.getCheckList();
    }

    public void waterCollected () {
        this.collectedWater = this.collectedWater + 1;
        update();

        if (this.collectedWater >=4 )
        { 
            System.out.println("4 items have been collected");
        }
    }

    public void addKeyItem (int item){
        item = item + item;
        update();
    }
    
    @Override
    public void update(Player player) {
        super.update(player);

        System.out.println(this.map.getCheckList().getCollectedWater());
        if(this.map.getCheckList().getCollectedWater() == 1)
        {
            this.isHidden = false;
            System.out.println("item have been collected");
        }
        
        if (player.overlaps(this) && !hasInteracted && this.isHidden == false)
        {
            hasInteracted = true;
            this.isHidden = true;
            this.map.getCheckList().waterCollected();
        }
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(2)
                .build();
        		
        return new GameObject(x+12, y, frame);
    }
}
