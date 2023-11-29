package Maps;

import java.util.ArrayList;

import Level.Map;
import Level.Trigger;
import Scripts.TestMap.IntroVideoScript;
import Scripts.TestMap.SerenaScript;
import Tilesets.BlankTileset;
import Utils.Point;

public class BlankMap extends Map 
{
    public BlankMap() 
    {
        super("blank_map.txt", new BlankTileset());
        this.playerStartPosition = new Point(250, 250);
    }

    public ArrayList<Trigger> loadTriggers() 
    {
        ArrayList<Trigger> triggers = new ArrayList<>();
        triggers.add(new Trigger(200, 200, 1000,800, new IntroVideoScript(), "introVideo"));
        return triggers;
     }

    public void loadScripts() 
    {
        //getMapTile(8, 9).setInteractScript(new IntroVideoScript());
    }
}

