package Screens;

import Engine.BackgroundMusic;
import Engine.GraphicsHandler;
import Engine.Key;
import Engine.Keyboard;
import Engine.Screen;
import EnhancedMapTiles.Weapon;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.*;
import Maps.JurassicMap;
import Maps.BlankMap;
import Maps.ZombieMap;
import Players.Blair;
import Players.Chuck;
import Utils.Direction;
import Utils.Point;

// This class is for when the platformer game is actually being played
public class PlayLevelScreen extends Screen {
    protected ScreenCoordinator screenCoordinator;
    protected Map map;
    protected Player player;
    protected PlayLevelScreenState playLevelScreenState;
    protected WinScreen winScreen;
    protected LoseScreen loseScreen;
    protected QuitScreen quitScreen;
    protected FlagManager flagManager;
    protected PlayerSelection selectionScreen;
    protected boolean isChuckSelected;
    protected BackgroundMusic backgroundMusic;

    public PlayLevelScreen(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator;
    }
    
    public void initialize() {
        // setup state
        flagManager = new FlagManager();
        flagManager.addFlag("hasTalkedToSerena", false);
        flagManager.addFlag("introVideo", false);
        // flagManager.addFlag("hasCollectedItem1", false);

        // define/setup map
        this.map = new BlankMap();
        map.setFlagManager(flagManager);

        backgroundMusic = new BackgroundMusic("Resources/Zombies.wav");

        selectionScreen = new PlayerSelection(this);

        winScreen = new WinScreen(this);
        playLevelScreenState = PlayLevelScreenState.SELECTION;

        loseScreen = new LoseScreen(this);
        playLevelScreenState = PlayLevelScreenState.SELECTION;

        quitScreen = new QuitScreen(this);
        playLevelScreenState = PlayLevelScreenState.SELECTION;
    }



    public void update() {
        // based on screen state, perform specific actions
        switch (playLevelScreenState) {
                // if level is "running" update player and map to keep game logic for the platformer level going
            case RUNNING:
                player.update();
                if(Map.getMapTransition() == 0)
                {
                    if (Keyboard.isKeyDown(Key.ENTER)) {
                        backgroundMusic.play(); // Start playing the background music
                        mapTransition1();
                        player.update();
                    }
                    
                }

                if(Map.getMapTransition() == 1)
                {
                        backgroundMusic.stop();
                        playLevelScreenState = PlayLevelScreenState.BETWEEN_LEVELS;
                        mapTransition();
                        Weapon.hasInteracted = false;
                        this.map.setMapTransition(2);
                        player.update();
                }
                if (HealthMeter.count <= 0){
                    playLevelScreenState = PlayLevelScreenState.LOSE;
                    this.map.setMapTransition(3);
                    player.update();
                }
                // if ((CheckList.collectedItems ==5) && (Map.getMapTransition() == 3)) {
                //     playLevelScreenState = PlayLevelScreenState.LEVEL_COMPLETED;
                // }
                map.update(player);
                break;

            // if level has been completed, bring up level cleared screen
            case LEVEL_COMPLETED:
                winScreen.update();
                break;
            case LOSE:
                loseScreen.update();
                break;
            case SELECTION:
                selectionScreen.update();
                break;
            case BETWEEN_LEVELS:
                quitScreen.update();
                break;
            
        }

        // // if flag is set at any point during gameplay, game is "won"
        // if (map.getFlagManager().isFlagSet("hasFoundBall")) {
        //     playLevelScreenState = PlayLevelScreenState.LEVEL_COMPLETED;
        // }

        // // if flag is set at any point during gameplay, game is "won"
        // if (map.getFlagManager().isFlagSet("hasFoundBall")) {
        //     playLevelScreenState = PlayLevelScreenState.LEVEL_COMPLETED;
        // }

    }

    public void draw(GraphicsHandler graphicsHandler) {
        // based on screen state, draw appropriate graphics
        switch (playLevelScreenState) {
            case RUNNING:
                map.draw(player, graphicsHandler);
                break;
            case LEVEL_COMPLETED:
                winScreen.draw(graphicsHandler);
                break;
            case LOSE:
                loseScreen.draw(graphicsHandler);
                break; 
            case SELECTION:
                selectionScreen.draw(graphicsHandler);
                break;               
            case BETWEEN_LEVELS:
                quitScreen.draw(graphicsHandler);
                break;
        }
       
    }

    public void setGameState(PlayLevelScreenState playLevelScreenState) {
        //set up the isChuckSelected value
        if (playLevelScreenState == PlayLevelScreenState.RUNNING) {
            boolean isChuckSelected = selectionScreen.isChuckSelected();

            // Setup player
            if (isChuckSelected) {
                this.player = new Chuck(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
            } else {
                this.player = new Blair(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
            }

            this.player.setMap(map);
            Point playerStartPosition = map.getPlayerStartPosition();
            this.player.setLocation(playerStartPosition.x, playerStartPosition.y);
            this.player.setFacingDirection(Direction.LEFT);

            // let pieces of map know which button to listen for as the "interact" button
                map.getTextbox().setInteractKey(player.getInteractKey());

                // setup map scripts to have references to the map and player
                for (MapTile mapTile : map.getMapTiles()) {
                    if (mapTile.getInteractScript() != null) {
                        mapTile.getInteractScript().setMap(map);
                        mapTile.getInteractScript().setPlayer(player);
                    }
                }
                for (NPC npc : map.getNPCs()) {
                    if (npc.getInteractScript() != null) {
                        npc.getInteractScript().setMap(map);
                        npc.getInteractScript().setPlayer(player);
                    }
                }
                for (EnhancedMapTile enhancedMapTile : map.getEnhancedMapTiles()) {
                    if (enhancedMapTile.getInteractScript() != null) {
                        enhancedMapTile.getInteractScript().setMap(map);
                        enhancedMapTile.getInteractScript().setPlayer(player);
                    }
                }
                for (Trigger trigger : map.getTriggers()) {
                    if (trigger.getTriggerScript() != null) {
                        trigger.getTriggerScript().setMap(map);
                        trigger.getTriggerScript().setPlayer(player);
                    }
                }
            }
        this.playLevelScreenState = playLevelScreenState;
    }

    public PlayLevelScreenState getPlayLevelScreenState() {
        return playLevelScreenState;
    }


    public void resetLevel() {
        HealthMeter.count = 50;
        Weapon.hasInteracted = false;
        initialize();
    }

    public void nextLevel() {
        update();
    }

    public void goBackToMenu() {
        HealthMeter.count = 50;
        Weapon.hasInteracted = false;
        screenCoordinator.setGameState(GameState.MENU);
    }

    // This enum represents the different states this screen can be in
    protected enum PlayLevelScreenState {
        RUNNING, LEVEL_COMPLETED, SELECTION, LOSE, BETWEEN_LEVELS
    }

    //check the map number
    public void mapTransition(){
            // define/setup map
            this.map = new JurassicMap();
            this.map.setMapTransition(2);
            player.update();
            map.setFlagManager(flagManager);
            // let pieces of map know which button to listen for as the "interact" button
            map.getTextbox().setInteractKey(player.getInteractKey());

            this.player.setMap(map);
            Point playerStartPosition = map.getPlayerStartPosition();
            this.player.setLocation(playerStartPosition.x, playerStartPosition.y);
            this.player.setFacingDirection(Direction.LEFT);
            

            // let pieces of map know which button to listen for as the "interact" button
                map.getTextbox().setInteractKey(player.getInteractKey());

                // setup map scripts to have references to the map and player
                for (MapTile mapTile : map.getMapTiles()) {
                    if (mapTile.getInteractScript() != null) {
                        mapTile.getInteractScript().setMap(map);
                        mapTile.getInteractScript().setPlayer(player);
                    }
                }
                for (NPC npc : map.getNPCs()) {
                    if (npc.getInteractScript() != null) {
                        npc.getInteractScript().setMap(map);
                        npc.getInteractScript().setPlayer(player);
                    }
                }
                for (EnhancedMapTile enhancedMapTile : map.getEnhancedMapTiles()) {
                    if (enhancedMapTile.getInteractScript() != null) {
                        enhancedMapTile.getInteractScript().setMap(map);
                        enhancedMapTile.getInteractScript().setPlayer(player);
                    }
                }
                for (Trigger trigger : map.getTriggers()) {
                    if (trigger.getTriggerScript() != null) {
                        trigger.getTriggerScript().setMap(map);
                        trigger.getTriggerScript().setPlayer(player);
                    }
                }

        }

    //check the map number
    public void mapTransition1(){
            // define/setup map
            this.map = new ZombieMap();
            map.setFlagManager(flagManager);
            // let pieces of map know which button to listen for as the "interact" button
            map.getTextbox().setInteractKey(player.getInteractKey());

            this.player.setMap(map);
            Point playerStartPosition = map.getPlayerStartPosition();
            this.player.setLocation(playerStartPosition.x, playerStartPosition.y);
            this.player.setFacingDirection(Direction.LEFT);
            

            // let pieces of map know which button to listen for as the "interact" button
                map.getTextbox().setInteractKey(player.getInteractKey());

                // setup map scripts to have references to the map and player
                for (MapTile mapTile : map.getMapTiles()) {
                    if (mapTile.getInteractScript() != null) {
                        mapTile.getInteractScript().setMap(map);
                        mapTile.getInteractScript().setPlayer(player);
                    }
                }
                for (NPC npc : map.getNPCs()) {
                    if (npc.getInteractScript() != null) {
                        npc.getInteractScript().setMap(map);
                        npc.getInteractScript().setPlayer(player);
                    }
                }
                for (EnhancedMapTile enhancedMapTile : map.getEnhancedMapTiles()) {
                    if (enhancedMapTile.getInteractScript() != null) {
                        enhancedMapTile.getInteractScript().setMap(map);
                        enhancedMapTile.getInteractScript().setPlayer(player);
                    }
                }
                for (Trigger trigger : map.getTriggers()) {
                    if (trigger.getTriggerScript() != null) {
                        trigger.getTriggerScript().setMap(map);
                        trigger.getTriggerScript().setPlayer(player);
                    }
                }

        }


}
