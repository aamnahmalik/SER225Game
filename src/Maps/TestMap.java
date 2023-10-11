package Maps;

import EnhancedMapTiles.FirstAidKit;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.PushableRock;


import Game.Game;
import GameObject.Frame;
import GameObject.GameObject;
import Level.EnhancedMapTile;
import Level.Map;
import Level.NPC;
import Level.Trigger;
import NPCs.Dinosaur;
import NPCs.Serena;
import NPCs.Walrus;
import NPCs.Zombies;
import Scripts.SimpleTextScript;
import Scripts.TestMap.DinoScript;
import Scripts.TestMap.LostBallScript;
import Scripts.TestMap.SerenaScript;
import Scripts.TestMap.TreeScript;
import Scripts.TestMap.WalrusScript;
import Tilesets.CommonTileset;

import java.util.ArrayList;

import Engine.ImageLoader;

// Represents a test map to be used in a level
public class TestMap extends Map {

    public TestMap() {
        super("test_map.txt", new CommonTileset());
        this.playerStartPosition = getMapTile(17, 20).getLocation();
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        PushableRock pushableRock = new PushableRock(getMapTile(2, 7).getLocation());
        enhancedMapTiles.add(pushableRock);

        return enhancedMapTiles;
    }

    @Override
    public ArrayList<NPC> loadNPCs() {
        ArrayList<NPC> npcs = new ArrayList<>();

        Walrus walrus = new Walrus(1, getMapTile(4, 28).getLocation().subtractY(40));
        walrus.setInteractScript(new WalrusScript());
        npcs.add(walrus);

        Dinosaur dinosaur = new Dinosaur(2, getMapTile(13, 4).getLocation());
        dinosaur.setExistenceFlag("hasTalkedToDinosaur");
        dinosaur.setInteractScript(new DinoScript());
        npcs.add(dinosaur);

        Zombies zombie1 = new Zombies(3, getMapTile(12, 20).getLocation());
        npcs.add(zombie1);

        Zombies zombie2 = new Zombies(4, getMapTile(14, 20).getLocation());
        npcs.add(zombie2);

        Zombies zombie3 = new Zombies(5, getMapTile(12, 18).getLocation());
        npcs.add(zombie3);

        Zombies zombie4 = new Zombies(6, getMapTile(14, 18).getLocation());
        npcs.add(zombie4);

        Zombies zombie5 = new Zombies(7, getMapTile(12, 16).getLocation());
        npcs.add(zombie5);

        Serena serena = new Serena(3, getMapTile(20, 25).getLocation());
        serena.setInteractScript(new SerenaScript());
        npcs.add(serena);

        return npcs;
    }

    @Override
    public ArrayList<Trigger> loadTriggers() {
        ArrayList<Trigger> triggers = new ArrayList<>();
        triggers.add(new Trigger(790, 1030, 100, 10, new LostBallScript(), "hasLostBall"));
        triggers.add(new Trigger(790, 960, 10, 80, new LostBallScript(), "hasLostBall"));
        triggers.add(new Trigger(890, 960, 10, 80, new LostBallScript(), "hasLostBall"));
        triggers.add(new Trigger(200, 200, 10,80, new SerenaScript(), "hasTalkedToSerena"));
        return triggers;
    }

    @Override
    public void loadScripts() {
        getMapTile(21, 19).setInteractScript(new SimpleTextScript("Cat's house"));

        getMapTile(7, 26).setInteractScript(new SimpleTextScript("Walrus's house"));

        getMapTile(20, 4).setInteractScript(new SimpleTextScript("Dino's house"));

        getMapTile(2, 6).setInteractScript(new TreeScript());

        getMapTile(20, 25).setInteractScript(new SerenaScript());
    }
}

