package Maps;

import java.util.ArrayList;

import Level.Map;
import Level.Trigger;
import Scripts.TestMap.IntroVideoScript1;
import Scripts.TestMap.IntroVideoScript2;
import Scripts.TestMap.IntroVideoScript3;
import Scripts.TestMap.IntroVideoScript4;
import Scripts.TestMap.IntroVideoScript5;
import Scripts.TestMap.SerenaScript;
import Tilesets.BlankTileset;
import Utils.Point;

public class BlankMap extends Map 
{
    public BlankMap() 
    {
        super("blank_map.txt", new BlankTileset());
        this.playerStartPosition = new Point(200, 200);
    }

    public ArrayList<Trigger> loadTriggers() 
    {
         ArrayList<Trigger> triggers = new ArrayList<>();

         triggers.add(new Trigger(200, 200, 10000,10000, new IntroVideoScript1(), "enter1"));
         triggers.add(new Trigger(0, 200, 100,100, new IntroVideoScript2(), "enter2"));
         triggers.add(new Trigger(0, 0, 80,100, new IntroVideoScript3(), "enter3"));
        triggers.add(new Trigger(1030, 0, 80,100, new IntroVideoScript4(), "enter4"));
        triggers.add(new Trigger(1030, 300, 200,200, new IntroVideoScript5(), "enter5"));
        return triggers;
     }

    public void loadScripts() 
    {
        getMapTile(20, 25).setInteractScript(new IntroVideoScript1());
        getMapTile(20, 25).setInteractScript(new IntroVideoScript2());
        getMapTile(20, 25).setInteractScript(new IntroVideoScript3());
        getMapTile(20, 25).setInteractScript(new IntroVideoScript4());
        getMapTile(20, 25).setInteractScript(new IntroVideoScript5());

    }
}

