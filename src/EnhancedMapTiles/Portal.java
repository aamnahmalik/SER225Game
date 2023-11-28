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
import Level.ScriptState;
import Level.Script;

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
            this.map.getCheckList().itemCollected(); 
            this.map.getCheckList().portalCollected();
            this.map.setMapTransition(1);
            
            if (player.overlaps(this) && !hasInteracted)
        {
        	map.setHasChangedHealthMeter(true);
            hasInteracted = true;
            this.isHidden = true;
            this.map.getCheckList().itemCollected(); 
            this.map.getCheckList().portalCollected();
            this.map.setMapTransition(2);
            

        }

        

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

