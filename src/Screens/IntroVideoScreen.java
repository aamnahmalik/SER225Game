package Screens;

import java.awt.*;
import Engine.GraphicsHandler;
import Engine.Key;
import Engine.Keyboard;
import Engine.Screen;
import Game.ScreenCoordinator;
import Level.Player;
import Players.Blair;
import Players.Chuck;
import Screens.PlayLevelScreen.PlayLevelScreenState;
import Utils.Direction;

public class IntroVideoScreen extends Screen{

    protected ScreenCoordinator screenCoordinator;
    protected IntroVideoScreen introVideoScreen;
    protected PlayLevelScreen playLevelScreen;
    protected PlayLevelScreenState playLevelScreenState;
    protected PlayerSelection selectionScreen;
    protected Player player;
    private boolean isChuckSelected;
    protected Blair blair;

    public IntroVideoScreen(PlayLevelScreen playLevelScreen, boolean isChuckSelected) {
        this.playLevelScreen = playLevelScreen;
        this.isChuckSelected = isChuckSelected;
        initialize();
    }
    public void initialize() {
        //screenCoordinator = new ScreenCoordinator();

    }

    public void update() {
        //Transition to another screen when Enter is pressed
        if (Keyboard.isKeyDown(Key.ENTER)) {
            playLevelScreen.setGameState(PlayLevelScreenState.RUNNING);
        } //set up the isChuckSelected value
        
    }
    public void draw(GraphicsHandler graphicsHandler) {
         // Draw a black background
         graphicsHandler.drawFilledRectangle( 0, 0, 800, 600, Color.BLACK);
         graphicsHandler.fillRect(0, 0, 600, 800);
    }
}


