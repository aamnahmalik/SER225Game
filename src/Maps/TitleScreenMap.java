package Maps;

import java.util.ArrayList;

import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.ImageEffect;
import GameObject.Sprite;
import Level.Map;
import Level.NPC;
import NPCs.NightSky;
import NPCs.Serena;
import NPCs.Zombies;
import Scripts.TestMap.SerenaScript;
import Tilesets.CommonTileset;
import Utils.Colors;
import Utils.Point;

// Represents the map that is used as a background for the main menu and credits menu screen
public class TitleScreenMap extends Map {


    public TitleScreenMap() {
        super("title_screen_map.txt", new CommonTileset());
    }

     @Override
    public ArrayList<NPC> loadNPCs() 
    {
        ArrayList<NPC> npcs = new ArrayList<>();

        NightSky night = new NightSky(1, getMapTile(1,1).getLocation());
        npcs.add(night);

        return npcs;
    }

    @Override
    public void draw(GraphicsHandler graphicsHandler) {
        super.draw(graphicsHandler);
        
    }
}
