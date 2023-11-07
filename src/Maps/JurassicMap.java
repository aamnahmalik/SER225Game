package Maps;

import Level.Map;
import Tilesets.JurassicTileset;
import Utils.Point;

public class JurassicMap extends Map
{
    public JurassicMap() 
    {
        super("jurassic_map.txt", new JurassicTileset());
        this.playerStartPosition = new Point(1, 1);
    }    
}
