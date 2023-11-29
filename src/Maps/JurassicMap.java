package Maps;

import java.nio.file.DirectoryNotEmptyException;
import java.util.ArrayList;

import EnhancedMapTiles.FirstAidKit;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.Water;
import EnhancedMapTiles.Weapon;
import Level.EnhancedMapTile;
import Level.NPC;
import Level.Map;
import Level.NPC;
import Level.Trigger;
import NPCs.Dinosaur;
import Scripts.TestMap.Item1Script;
import Scripts.TestMap.Item2Script;
import Scripts.TestMap.Item3Script;
import Scripts.TestMap.Item4Script;
import Scripts.TestMap.LostBallScript;
import Scripts.TestMap.SerenaScript;
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
    public ArrayList<Trigger> loadTriggers() 
    {
        ArrayList<Trigger> triggers = new ArrayList<>();

        //water
        triggers.add(new Trigger(getMapTile(4,14).getLocation(), 40, 40, new Item3Script()));
        //firstaid
        triggers.add(new Trigger(getMapTile(22,1).getLocation(), 40, 40, new Item1Script()));
        //food
        triggers.add(new Trigger(getMapTile(5,1).getLocation(), 40, 40, new Item2Script()));
        //weapon
        triggers.add(new Trigger(getMapTile(18,22).getLocation(), 40, 40, new Item4Script()));


        return triggers;
    }

    @Override
    public ArrayList<NPC> loadNPCs() 
    {
        ArrayList<NPC> npcs = new ArrayList<>();

        Dinosaur dino1 = new Dinosaur(1, getMapTile(19, 4).getLocation());
        npcs.add(dino1);

        Dinosaur dino2 = new Dinosaur(2, getMapTile(7, 1).getLocation());
        npcs.add(dino2);

        Dinosaur dino3 = new Dinosaur(3, getMapTile(3, 6).getLocation());
        npcs.add(dino3);

        Dinosaur dino4 = new Dinosaur(4, getMapTile(9, 6).getLocation());
        npcs.add(dino4);

        Dinosaur dino5 = new Dinosaur(5, getMapTile(3, 18).getLocation());
        npcs.add(dino5);

        Dinosaur dino6 = new Dinosaur(6, getMapTile(6, 22).getLocation());
        npcs.add(dino6);

        Dinosaur dino7 = new Dinosaur(7, getMapTile(2, 28).getLocation());
        npcs.add(dino7);

        Dinosaur dino8 = new Dinosaur(8, getMapTile(9, 24).getLocation());
        npcs.add(dino8);

        Dinosaur dino9 = new Dinosaur(9, getMapTile(14, 22).getLocation());
        npcs.add(dino9);

        Dinosaur dino10 = new Dinosaur(10, getMapTile(21, 25).getLocation());
        npcs.add(dino10);

        Dinosaur dino11 = new Dinosaur(11, getMapTile(22, 21).getLocation());
        npcs.add(dino11);

        Dinosaur dino12 = new Dinosaur(12, getMapTile(15, 22).getLocation());
        npcs.add(dino12);

        Dinosaur dino13 = new Dinosaur(13, getMapTile(11, 16).getLocation());
        npcs.add(dino13);

        Dinosaur dino14 = new Dinosaur(14, getMapTile(20, 24).getLocation());
        npcs.add(dino14);

        Dinosaur dino15 = new Dinosaur(15, getMapTile(13, 2).getLocation());
        npcs.add(dino15);

        Dinosaur dino16 = new Dinosaur(16, getMapTile(7, 12).getLocation());
        npcs.add(dino16);

        Dinosaur dino17 = new Dinosaur(17, getMapTile(11, 22).getLocation());
        npcs.add(dino17);

        Dinosaur dino18 = new Dinosaur(18, getMapTile(17, 13).getLocation());
        npcs.add(dino18);

        Dinosaur dino19 = new Dinosaur(19, getMapTile(10, 10).getLocation());
        npcs.add(dino19);

        Dinosaur dino20 = new Dinosaur(20, getMapTile(17, 23).getLocation());
        npcs.add(dino20);

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
