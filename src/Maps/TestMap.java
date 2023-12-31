package Maps;

import EnhancedMapTiles.FirstAidKit;
import EnhancedMapTiles.Food;
import EnhancedMapTiles.PushableRock;
import EnhancedMapTiles.Water;
import EnhancedMapTiles.Weapon;
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

        enhancedMapTiles.add(new Water(getMapTile(6, 9).getLocation(), this));
        enhancedMapTiles.add(new FirstAidKit(getMapTile(5, 10).getLocation(), this));
        enhancedMapTiles.add(new Food(getMapTile(3, 8).getLocation(), this));
        enhancedMapTiles.add(new Weapon(getMapTile(4, 9).getLocation(), this));
        
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
        // triggers.add(new Trigger(200, 200, 600,600, new IntroVideoScript1(), "enter1"));
        // triggers.add(new Trigger(0, 0, 100,100, new IntroVideoScript2(), "enter2"));
        // triggers.add(new Trigger(0, 0, 80,100, new IntroVideoScript3(), "enter3"));
        return triggers;
    }

    @Override
    public void loadScripts() {
        getMapTile(21, 19).setInteractScript(new SimpleTextScript("Cat's house"));

        getMapTile(7, 26).setInteractScript(new SimpleTextScript("Walrus's house"));

        getMapTile(20, 4).setInteractScript(new SimpleTextScript("Dino's house"));

        getMapTile(2, 6).setInteractScript(new TreeScript());

        getMapTile(20, 25).setInteractScript(new SerenaScript());
               
        // getMapTile(20, 25).setInteractScript(new IntroVideoScript1());

        // getMapTile(20, 25).setInteractScript(new IntroVideoScript2());

        // getMapTile(20, 25).setInteractScript(new IntroVideoScript3());



        
    }

    
}
