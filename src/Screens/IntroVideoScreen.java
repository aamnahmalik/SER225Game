package Screens;

import Engine.GraphicsHandler;
import Engine.Key;
import Engine.Keyboard;
import Engine.Screen;
import Game.ScreenCoordinator;
import Level.Player;
import Maps.BlankMap;
import Players.Blair;
import Screens.PlayLevelScreen.PlayLevelScreenState;
import Level.Map;

public class IntroVideoScreen extends Screen{

    protected ScreenCoordinator screenCoordinator;
    protected IntroVideoScreen introVideoScreen;
    protected PlayLevelScreen playLevelScreen;
    protected PlayLevelScreenState playLevelScreenState;
    protected PlayerSelection selectionScreen;
    protected Player player;
    private boolean isChuckSelected;
    protected Blair blair;
    protected Map map;

    public IntroVideoScreen(PlayLevelScreen playLevelScreen, boolean isChuckSelected) {
        this.playLevelScreen = playLevelScreen;
        this.isChuckSelected = isChuckSelected;
    }
    public void initialize() {
        // define/setup map
        this.map = new BlankMap();
    }

    public void update() {
        //Transition to another screen when Enter is pressed
        if (Keyboard.isKeyDown(Key.ENTER)) {
            playLevelScreen.setGameState(PlayLevelScreenState.RUNNING);
        } //set up the isChuckSelected value
        
    }
    public void draw(GraphicsHandler graphicsHandler) 
    {
        ///map.draw(player, graphicsHandler);
    }

}