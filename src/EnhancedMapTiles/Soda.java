package EnhancedMapTiles;

import Builders.FrameBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.GameObject;
import GameObject.SpriteSheet;
import Level.HealthMeter;
import Level.EnhancedMapTile;
import Level.Map;
import Level.Player;
import Level.PlayerState;
import Level.TileType;
import Maps.JurassicMap;
import Utils.Direction;
import Utils.Point;


public class Soda extends EnhancedMapTile{
	protected Map map;
	private boolean hasInteracted = false;

	
    public Soda(Point location) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("soda.png"),39, 63), TileType.PASSABLE);
    }

    public Soda(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("soda.png"),39, 63), TileType.PASSABLE);
        this.map = map;
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
            //this.map.getCheckList().sodaCollected();
        }
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(.2f)
                .withBounds(1, 1, 39, 63)
                .build();
        		
        return new GameObject(x, y, frame);
    }
}
