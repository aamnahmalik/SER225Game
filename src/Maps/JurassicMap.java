package Maps;

import Level.Map;
import Tilesets.JurassicTileset;

public class JurassicMap extends Map
{
    public JurassicMap() 
    {
        super("jurassic_map.txt", new JurassicTileset());
        this.playerStartPosition = getMapTile(17, 20).getLocation();
    }    
}
