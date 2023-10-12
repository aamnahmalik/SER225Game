package Maps;

import Level.Map;
import Tilesets.ZombieTileset;
import Utils.Point;

public class ZombieMap extends Map {
    
    public ZombieMap() 
    {
        super("zombie_map.txt", new ZombieTileset());
        this.playerStartPosition = new Point(1, 11);
    }    
}
