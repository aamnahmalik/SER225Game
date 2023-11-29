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


//axe

public class Weapon extends EnhancedMapTile
{
    protected Map map;
	public static boolean hasInteracted = false;
	
    public Weapon(Point location) 
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("Axe2.png"),14, 24), TileType.PASSABLE);
    }

    public Weapon(Point location, Map map) 
    {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("Axe2.png"),14, 24), TileType.PASSABLE);
        this.map = map;
    }    

    @Override
    public void update(Player player) 
    {
        super.update(player);

        if (Map.getMapTransition() == 2)
        {
            if (player.overlaps(this) && !hasInteracted)
            {
                hasInteracted = true;
                this.isHidden = true;
                this.map.getCheckList().itemCollected();
                this.map.getCheckList().weaponCollected();
            }
            else
            {
                hasInteracted = false;
            }
        }
        
        if (Map.getMapTransition() == 0 && player.overlaps(this) && !hasInteracted)
        {
            hasInteracted = true;
            this.isHidden = true;
            this.map.getCheckList().itemCollected();
            this.map.getCheckList().weaponCollected();
        }

        // if (Map.getMapTransition() == 2)
        // {
        //     hasInteracted = false;
        //     this.map.setMapTransition(4);
        // }


    }

    @Override
    protected GameObject loadBottomLayer(SpriteSheet spriteSheet) 
    {
        Frame frame = new FrameBuilder(spriteSheet.getSubImage(0, 0))
                .withScale(2)
                .withBounds(1, 2, 16, 28)
                .build();
        		
        return new GameObject(x, y, frame);
    }

    public static boolean hasTheWeapon()
    {
        if (hasInteracted == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

}

