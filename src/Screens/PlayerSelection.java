package Screens;

import Engine.*;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.Map;
import Level.Player;
import Maps.TitleScreenMap;
import Players.*;
import Screens.PlayLevelScreen.PlayLevelScreenState;
import SpriteFont.SpriteFont;


import java.awt.*;

public class PlayerSelection extends Screen {

    private static final String Players = null;
    protected ScreenCoordinator screenCoordinator;
    protected Map background;
    protected KeyLocker keyLocker = new KeyLocker();
    protected SpriteFont creditsLabel;
    protected SpriteFont createdByLabel;
    protected SpriteFont returnInstructionsLabel;
    private BlairCopy blair;
    private ChuckCopy chuck;
    protected SpriteFont selectYourPlayer;
    protected SpriteFont pressEnter;
    private boolean isChuckSelected; 
    private SpriteFont chuckLabel;
    private SpriteFont blairLabel;
    protected PlayLevelScreen playLevelScreen;
    protected IntroVideoScreen introVideoScreen;
    protected BackgroundMusic backgroundMusic;

    public PlayerSelection(PlayLevelScreen playLevelScreen) {
        this.playLevelScreen = playLevelScreen;
        this.blair = new BlairCopy(490, 190);  
        this.chuck = new ChuckCopy(115,190);
        initialize();
    }

    @Override
    public void initialize() {
        screenCoordinator = new ScreenCoordinator();
        selectYourPlayer = new SpriteFont("SELECT YOUR  PLAYER", 62 , 75, "ArcadeClassic", 75, Color.WHITE);
        pressEnter = new SpriteFont("PRESS  ENTER  WHEN  READY", 203 , 530, "ArcadeClassic", 35, Color.WHITE);
        chuckLabel = new SpriteFont("Chuck", 136, 400, "ArcadeClassic", 50, Color.WHITE);
        blairLabel = new SpriteFont("Blair", 520, 400, "ArcadeClassic", 50, Color.WHITE);
        backgroundMusic = new BackgroundMusic("Resources/Player.wav");
        backgroundMusic.play(); // Start playing the background music
    }
    

    @Override
    public void update() {
        if (Keyboard.isKeyDown(Key.RIGHT)) {
                isChuckSelected = false;
        } 
        else if (Keyboard.isKeyDown(Key.LEFT)) {
            isChuckSelected = true;
        }
        //Transition to another screen when Enter is pressed
        if (Keyboard.isKeyDown(Key.ENTER)) {
            backgroundMusic.stop();
            playLevelScreen.setGameState(PlayLevelScreenState.INTRO);
        }
    }

    @Override
    public void draw(GraphicsHandler graphicsHandler) {

        // Draw a black background
        graphicsHandler.drawFilledRectangle( 0, 0, 800, 600, Color.BLACK);
        graphicsHandler.fillRect(0, 0, 600, 800);
        blair.draw(graphicsHandler);
        chuck.draw(graphicsHandler);

        // Draw the text "SELECT YOUR PLAYER" n
        selectYourPlayer.draw(graphicsHandler);
        pressEnter.draw(graphicsHandler);

         // Draw character names
         if (isChuckSelected) {
            // Chuck is selected (draw in RED)
            chuckLabel.setColor(Color.RED);
            blairLabel.setColor(Color.WHITE);
        } else {
            // Blair is selected (draw in RED)
            chuckLabel.setColor(Color.WHITE);
            blairLabel.setColor(Color.RED);
        }

        chuckLabel.draw(graphicsHandler);
        blairLabel.draw(graphicsHandler);
        
    }
    public boolean isChuckSelected() {
        return isChuckSelected;
    }
}
