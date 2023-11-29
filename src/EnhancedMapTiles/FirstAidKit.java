package EnhancedMapTiles;

import Builders.FrameBuilder;
import Engine.BackgroundMusic;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.GameObject;
import GameObject.SpriteSheet;
import Level.EnhancedMapTile;
import Level.Map;
import Level.Player;
import Level.TileType;
import Utils.Point;

public class FirstAidKit extends EnhancedMapTile{
    
	protected Map map;
	private boolean hasInteracted = false;
    protected BackgroundMusic backgroundMusic;

	
    public FirstAidKit(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("firstaidkit.png"),31, 31), TileType.PASSABLE);
        this.map = map;
    }

    public FirstAidKit(Point location, Map map, int n) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("BandAidResized.png"),31, 31), TileType.PASSABLE);
        this.map = map;
    }

    @Override
    public void update(Player player) 
    {
        super.update(player);

        if (Map.getMapTransition() == 0 && player.overlaps(this) && !hasInteracted)
        {
            backgroundMusic = new BackgroundMusic("Resources/Item.wav");
            backgroundMusic.play(); // Start playing the background music
            try {
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            backgroundMusic.stop();

        	map.setHasChangedHealthMeter(true);
            hasInteracted = true;
            this.isHidden = true;
            try {
                this.map.getCheckList().itemCollected();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.map.getCheckList().firstAidKitCollected();
        }
        
        
    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(0.5f)
                .withBounds(0, 0, 39, 39)
                .build();
        		
        return new GameObject(x, y, frame);
    }
}
