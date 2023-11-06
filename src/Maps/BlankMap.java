package Maps;

import Level.Map;
import Tilesets.BlankTileset;
import Utils.Point;

public class BlankMap extends Map 
{
    public BlankMap() 
    {
        super("blank_map.txt", new BlankTileset());
        this.playerStartPosition = new Point(1, 1);
    }
}
