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

public class Portal extends EnhancedMapTile{


	private boolean hasInteracted = false;

	
    public Portal(Point location) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("portal.png"),209, 202), TileType.PASSABLE);
    }

    public Portal(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("portal.png"),209, 202), TileType.PASSABLE);
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
            try {
                this.map.getCheckList().itemCollected();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.map.getCheckList().portalCollected();
            this.map.setMapTansition(1);
        

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

