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
import Maps.TestMap;
import Utils.Direction;
import Utils.Point;
import EnhancedMapTiles.KeyPurple;

public class FirstAidKit extends EnhancedMapTile{
    
	protected Map map;
	private boolean hasInteracted = false;

	
    public FirstAidKit(Point location) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("firstaidkit.png"),40, 40), TileType.PASSABLE);
    }

    public FirstAidKit(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("firstaidkit.png"),40, 40), TileType.PASSABLE);
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
            this.map.getCheckList().firstAidKitCollected();
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
