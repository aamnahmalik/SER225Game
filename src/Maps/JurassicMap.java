package Maps;

import java.util.ArrayList;

import EnhancedMapTiles.FirstAidKit;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.Water;
import EnhancedMapTiles.Weapon;
import Level.EnhancedMapTile;
import Level.NPC;
import Level.Map;
import NPCs.Dan;
import Scripts.TestMap.DanScript;
import Tilesets.JurassicTileset;
import Utils.Point;

public class JurassicMap extends Map
{
    public JurassicMap() 
    {
        super("jurassic_map.txt", new JurassicTileset());
        this.playerStartPosition = getMapTile(13, 5).getLocation();
    }    

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() 
    {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new Water(getMapTile(4, 14).getLocation(), this));
        enhancedMapTiles.add(new FirstAidKit(getMapTile(22, 1).getLocation(), this));
        enhancedMapTiles.add(new Food(getMapTile(5, 1).getLocation(), this));
        enhancedMapTiles.add(new Weapon(getMapTile(18, 22).getLocation(), this));
        //41,67


        return enhancedMapTiles;
    }

    @Override 
    public ArrayList<NPC> loadNPCs()
    { 
        ArrayList<NPC> npcs = new ArrayList<>();

        Dan dan = new Dan(21, getMapTile(2,9).getLocation());
        dan.setInteractScript(new DanScript());
        npcs.add(dan);

        return npcs;

    }

    @Override 
    public void loadScripts()
    { 
        getMapTile(10, 10).setInteractScript(new DanScript());
    }
}
