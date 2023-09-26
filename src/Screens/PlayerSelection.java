package Screens;

import Engine.*;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.Map;
import Maps.TitleScreenMap;
import Players.*;
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
    private Blair blair;
    private Chuck chuck;
    protected SpriteFont selectYourPlayer;
    protected SpriteFont pressEnter;
    private boolean isChuckSelected = true; // Initially, Chuck is selected
    private SpriteFont chuckLabel;
    private SpriteFont blairLabel;

    public PlayerSelection(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator; 
        this.blair = new Blair(495, 190);  
        this.chuck = new Chuck(115,190);
    }

    @Override
    public void initialize() {
        selectYourPlayer = new SpriteFont("SELECT YOUR  PLAYER", 62 , 75, "ArcadeClassic", 75, Color.WHITE);
        pressEnter = new SpriteFont("PRESS  ENTER  WHEN  READY", 203 , 530, "ArcadeClassic", 35, Color.WHITE);
        chuckLabel = new SpriteFont("Chuck", 136, 400, "ArcadeClassic", 50, Color.WHITE);
        blairLabel = new SpriteFont("Blair", 520, 400, "ArcadeClassic", 50, Color.WHITE);
    }
    

    @Override
    public void update() {
        if (Keyboard.isKeyDown(Key.RIGHT)) {
            isChuckSelected = false;
        }

        if (Keyboard.isKeyDown(Key.LEFT)) {
            isChuckSelected = true;
        }

        //Transition to another screen when Enter is pressed
        if (Keyboard.isKeyDown(Key.ENTER)) {
            // Replace 'GameState.MENU' with the appropriate game state
            // you want to transition to (e.g., the game itself).
            screenCoordinator.setGameState(GameState.LEVEL);
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
}
