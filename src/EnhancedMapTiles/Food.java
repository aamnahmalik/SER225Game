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

public class Food extends EnhancedMapTile{
	protected Map map;
	private boolean hasInteracted = false;
	
    public Food(Point location) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("food.png"),58, 55), TileType.PASSABLE);
    }

    public Food(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("food.png"),57, 53), TileType.PASSABLE);
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
            this.map.getCheckList().foodCollected();
        }
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(0.5f)
                .withBounds(1, 1, 56, 53)
                .build();
        		
        return new GameObject(x, y, frame);
    }

}
