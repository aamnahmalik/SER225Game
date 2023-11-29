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
import NPCs.Dan;
import NPCs.Zombies;
import Scripts.TestMap.SerenaScript;
import Scripts.TestMap.DanScript;
import Tilesets.ZombieTileset;
import Utils.Point;

public class ZombieMap extends Map {
    

    public ZombieMap() 
    {
        super("zombie_map.txt", new ZombieTileset());
        this.playerStartPosition = getMapTile(13, 5).getLocation();
    }
    
    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() 
    {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new Water(getMapTile(19, 24).getLocation(), this));
        enhancedMapTiles.add(new FirstAidKit(getMapTile(11, 18).getLocation(), this));
        enhancedMapTiles.add(new Food(getMapTile(5, 28).getLocation(), this));
        enhancedMapTiles.add(new Weapon(getMapTile(1, 17).getLocation(), this));
        

        return enhancedMapTiles;
    }

    @Override
    public ArrayList<NPC> loadNPCs() 
    {
        ArrayList<NPC> npcs = new ArrayList<>();

        Zombies zombie1 = new Zombies(1, getMapTile(19, 4).getLocation());
        npcs.add(zombie1);

        Zombies zombie2 = new Zombies(2, getMapTile(7, 1).getLocation());
        npcs.add(zombie2);

        Zombies zombie3 = new Zombies(3, getMapTile(3, 6).getLocation());
        npcs.add(zombie3);

        Zombies zombie4 = new Zombies(4, getMapTile(9, 6).getLocation());
        npcs.add(zombie4);

        Zombies zombie5 = new Zombies(5, getMapTile(3, 18).getLocation());
        npcs.add(zombie5);

        Zombies zombie6 = new Zombies(6, getMapTile(6, 22).getLocation());
        npcs.add(zombie6);

        Zombies zombie7 = new Zombies(7, getMapTile(2, 28).getLocation());
        npcs.add(zombie7);

        Zombies zombie8 = new Zombies(8, getMapTile(9, 24).getLocation());
        npcs.add(zombie8);

        Zombies zombie9 = new Zombies(9, getMapTile(14, 22).getLocation());
        npcs.add(zombie9);

        Zombies zombie10 = new Zombies(10, getMapTile(21, 25).getLocation());
        npcs.add(zombie10);

        Zombies zombie11 = new Zombies(11, getMapTile(22, 21).getLocation());
        npcs.add(zombie11);

        Zombies zombie12 = new Zombies(12, getMapTile(15, 22).getLocation());
        npcs.add(zombie12);

        Zombies zombie13 = new Zombies(13, getMapTile(11, 16).getLocation());
        npcs.add(zombie13);

        Zombies zombie14 = new Zombies(14, getMapTile(20, 24).getLocation());
        npcs.add(zombie14);

        Zombies zombie15 = new Zombies(15, getMapTile(13, 2).getLocation());
        npcs.add(zombie15);

        Zombies zombie16 = new Zombies(16, getMapTile(7, 12).getLocation());
        npcs.add(zombie16);

        Zombies zombie17 = new Zombies(17, getMapTile(11, 22).getLocation());
        npcs.add(zombie17);

        Zombies zombie18 = new Zombies(18, getMapTile(17, 13).getLocation());
        npcs.add(zombie18);

        Zombies zombie19 = new Zombies(19, getMapTile(10, 10).getLocation());
        npcs.add(zombie19);

        Zombies zombie20 = new Zombies(20, getMapTile(17, 23).getLocation());
        npcs.add(zombie20);

        Serena serena = new Serena(21, getMapTile(20, 27).getLocation());
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
