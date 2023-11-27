package Screens;

import Engine.*;
import Screens.PlayLevelScreen.PlayLevelScreenState;
import SpriteFont.SpriteFont;

import java.awt.*;

// This class is for the lose level screen
public class QuitScreen extends Screen 
{
    protected SpriteFont message;
    protected SpriteFont instructions;
    protected KeyLocker keyLocker = new KeyLocker();
    protected PlayLevelScreen playLevelScreen;

    public QuitScreen(PlayLevelScreen playLevelScreen) 
    {
        this.playLevelScreen = playLevelScreen;
        initialize();
    }



    @Override
    public void initialize() {
        message = new SpriteFont("Congratulations!! You completed the first level!", 50, 239, "Comic Sans", 30, Color.white);
        instructions = new SpriteFont("Press Space to continue to the next level or Escape to exit the game", 75, 279,"Comic Sans", 20, Color.white);
        keyLocker.lockKey(Key.SPACE);
        keyLocker.lockKey(Key.ESC);
    }

    @Override
    public void update() {
        if (Keyboard.isKeyUp(Key.SPACE)) {
            keyLocker.unlockKey(Key.SPACE);
        }
        if (Keyboard.isKeyUp(Key.ESC)) {
            keyLocker.unlockKey(Key.ESC);
        }

        // if space is pressed, next level. if escape is pressed, quit
        if (Keyboard.isKeyDown(Key.SPACE) && !keyLocker.isKeyLocked(Key.SPACE)) {
            playLevelScreen.setGameState(PlayLevelScreenState.RUNNING);
        } else if (Keyboard.isKeyDown(Key.ESC) && !keyLocker.isKeyLocked(Key.ESC)) {
            System.exit(0);
        }
    }

    public void draw(GraphicsHandler graphicsHandler) {
        graphicsHandler.drawFilledRectangle(0, 0, ScreenManager.getScreenWidth(), ScreenManager.getScreenHeight(), Color.black);
        message.draw(graphicsHandler);
        instructions.draw(graphicsHandler);
    }
}