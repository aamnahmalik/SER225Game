package Maps;

import java.util.ArrayList;

import EnhancedMapTiles.FirstAidKit;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.KeyPurple;
import EnhancedMapTiles.Water;
import EnhancedMapTiles.Weapon;
import Level.EnhancedMapTile;
import Level.Map;
import Level.NPC;
import Level.CheckList;
import Level.Trigger;
import NPCs.Serena;
import NPCs.Zombies;
import Scripts.TestMap.SerenaScript;
import Tilesets.ZombieTileset;
import Utils.Point;

public class ZombieMap extends Map {
    

    public ZombieMap() 
    {
        super("zombie_map.txt", new ZombieTileset());
        this.playerStartPosition = getMapTile(17, 20).getLocation();
    }
    
    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() 
    {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new Water(getMapTile(5, 4).getLocation(), this));
        enhancedMapTiles.add(new FirstAidKit(getMapTile(19, 28).getLocation(), this));
        enhancedMapTiles.add(new Food(getMapTile(4, 26).getLocation(), this));
        enhancedMapTiles.add(new Weapon(getMapTile(17, 13).getLocation(), this));
        

        return enhancedMapTiles;
    }

    @Override
    public ArrayList<NPC> loadNPCs() 
    {
        ArrayList<NPC> npcs = new ArrayList<>();

        Zombies zombie1 = new Zombies(1, getMapTile(3, 6).getLocation());
        npcs.add(zombie1);

        Zombies zombie2 = new Zombies(2, getMapTile(15, 3).getLocation());
        npcs.add(zombie2);

        Zombies zombie3 = new Zombies(3, getMapTile(19, 6).getLocation());
        npcs.add(zombie3);

        Zombies zombie4 = new Zombies(4, getMapTile(10, 11).getLocation());
        npcs.add(zombie4);

        Zombies zombie5 = new Zombies(5, getMapTile(2, 15).getLocation());
        npcs.add(zombie5);

        Zombies zombie6 = new Zombies(6, getMapTile(14, 20).getLocation());
        npcs.add(zombie6);

        Zombies zombie7 = new Zombies(7, getMapTile(21, 13).getLocation());
        npcs.add(zombie7);

        Zombies zombie8 = new Zombies(8, getMapTile(19, 16).getLocation());
        npcs.add(zombie8);

        Zombies zombie9 = new Zombies(9, getMapTile(11, 21).getLocation());
        npcs.add(zombie9);

        Zombies zombie10 = new Zombies(10, getMapTile(22, 23).getLocation());
        npcs.add(zombie10);

        Serena serena = new Serena(11, getMapTile(20, 25).getLocation());
        serena.setInteractScript(new SerenaScript());
        npcs.add(serena);

        return npcs;
    }

    // @Override
    // public ArrayList<Trigger> loadTriggers() 
    // {
    //     ArrayList<Trigger> triggers = new ArrayList<>();

    //     triggers.add(new Trigger(200, 200, 10,80, new SerenaScript(), "hasTalkedToSerena"));

    //     return triggers;
    // }

    @Override
    public void loadScripts() 
    {
        getMapTile(20, 25).setInteractScript(new SerenaScript());
    }
}
