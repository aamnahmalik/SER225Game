package Screens;

import Engine.GraphicsHandler;
import Engine.Screen;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.*;
import Maps.TestMap;
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
    protected FlagManager flagManager;
    protected PlayerSelection selectionScreen;

    public PlayLevelScreen(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator;
    }
    
    public void initialize() {

        // setup state
        flagManager = new FlagManager();
        flagManager.addFlag("hasLostBall", false);
        flagManager.addFlag("hasTalkedToWalrus", false);
        flagManager.addFlag("hasTalkedToDinosaur", false);
        flagManager.addFlag("hasFoundBall", false);
        flagManager.addFlag("hasTalkedToSerena", false);

        // define/setup map
        this.map = new TestMap();
        map.setFlagManager(flagManager);

        selectionScreen = new PlayerSelection(this);

    
        // if flag is set at any point during gameplay, game is "won"
        if (map.getFlagManager().isFlagSet("hasFoundBall")) {
            playLevelScreenState = PlayLevelScreenState.LEVEL_COMPLETED;
        }
    
        
        //set up the value of isChuckSelected
                boolean isChuckSelected = selectionScreen.isChuckSelected();

                // setup player
                if(isChuckSelected)
                {
                    this.player = new Chuck(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                }
                else 
                {
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

        winScreen = new WinScreen(this);
        playLevelScreenState = PlayLevelScreenState.SELECTION;
    }


    public void update() {
        // based on screen state, perform specific actions
        switch (playLevelScreenState) {
                // if level is "running" update player and map to keep game logic for the platformer level going
                case RUNNING:
                player.update();
                map.update(player);
                break;
            // if level has been completed, bring up level cleared screen
            case LEVEL_COMPLETED:
                winScreen.update();
                break;
            case SELECTION:
                selectionScreen.update();
                break;
        }

        // if flag is set at any point during gameplay, game is "won"
        if (map.getFlagManager().isFlagSet("hasFoundBall")) {
            playLevelScreenState = PlayLevelScreenState.LEVEL_COMPLETED;
        }
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
            case SELECTION:
                selectionScreen.draw(graphicsHandler);
                break;
        }
    }

    public void setGameState(PlayLevelScreenState playLevelScreenState) {
        this.playLevelScreenState = playLevelScreenState;
    }

    public PlayLevelScreenState getPlayLevelScreenState() {
        return playLevelScreenState;
    }


    public void resetLevel() {
        initialize();
    }

    public void goBackToMenu() {
        screenCoordinator.setGameState(GameState.MENU);
    }

    // This enum represents the different states this screen can be in
    protected enum PlayLevelScreenState {
        RUNNING, LEVEL_COMPLETED, SELECTION
    }


}
