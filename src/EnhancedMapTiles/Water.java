package EnhancedMapTiles;

import Builders.FrameBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.GameObject;
import GameObject.SpriteSheet;
import Level.EnhancedMapTile;
import Level.Map;
import Level.Player;
import Level.TileType;
import Utils.Point;


public class Water extends EnhancedMapTile{
	private boolean hasInteracted = false;
    
	
    public Water(Point location) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("waterbottle.png"),92, 261), TileType.PASSABLE);
    }

    public Water(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("waterbottle.png"),92, 261), TileType.PASSABLE);
        this.map = map;
    }

    @Override
    public void update(Player player) {
        super.update(player);
        
         if (Map.getMapTransition() == 0 && player.overlaps(this) && !hasInteracted)
        {
        	map.setHasChangedHealthMeter(true);
            hasInteracted = true;
            this.isHidden = true;
            this.map.getCheckList().itemCollected();
            this.map.getCheckList().waterCollected();
        }
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(0.17f)
                .withBounds(1, 1, 93, 256)
                .build();
        		
        return new GameObject(x, y, frame);
    }
}
