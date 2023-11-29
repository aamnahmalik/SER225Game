package EnhancedMapTiles;


import Engine.ImageLoader;
import EnhancedMapTiles.KeyPurple;
import GameObject.SpriteSheet;
import Builders.FrameBuilder;
import GameObject.Frame;
import GameObject.GameObject;
import Level.EnhancedMapTile;
import Level.Map;
import Level.Player;
import Level.TileType;
import Level.CheckList;
import Utils.Point;


public class KeyPurple extends EnhancedMapTile{
    public int collectedItems;
    protected Map map;
    private boolean hasInteracted = false;
    protected CheckList checklist;
    public int keyCollected;

    @Override
    public void update() {
        super.update();
        itemCollected();
    }
    public KeyPurple(Point location)
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),17, 17), TileType.PASSABLE);
    }
     
    public KeyPurple(Point location, Map map) 
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("keyPurple.png"),17, 17), TileType.PASSABLE);
        this.map = map;
        this.checklist = this.map.getCheckList();
    }

    public void itemCollected () {
        this.collectedItems = this.collectedItems + 1;
        update();
    }

    public void addKeyItem (int item){
        item = item + item;
        update();
    }
    
    @Override
    public void update(Player player) {
        super.update(player);

        if(this.map.getCheckList().getCollectedItems() >= 4)
        {
            this.isHidden = false;
        }
        
        if (player.overlaps(this) && !hasInteracted && this.isHidden == false)
        {
            hasInteracted = true;
            this.isHidden = true;
            this.map.getCheckList().itemCollected();
        }
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(1.3f)
                .withBounds(1, 2, 17, 17)
                .build();
        		
        return new GameObject(x, y, frame);
    }
}