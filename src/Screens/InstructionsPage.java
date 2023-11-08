package Screens;

import Engine.*;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.Map;
import Maps.TitleScreenMap;
import SpriteFont.SpriteFont;

import java.awt.*;

// This class is for the credits screen
public class InstructionsPage extends Screen {
    protected ScreenCoordinator screenCoordinator;
    protected Map background;
    protected KeyLocker keyLocker = new KeyLocker();
    protected SpriteFont instructionsLabel;
    protected SpriteFont createdByLabel;
    protected SpriteFont createdByLabel1;
    protected SpriteFont createdByLabel2;
    protected SpriteFont createdByLabel3;
    protected SpriteFont createdByLabel4;
    protected SpriteFont createdByLabel5;
    protected SpriteFont createdByLabel6;
    protected SpriteFont createdByLabel7;
    protected SpriteFont returnInstructionsLabel;

    public InstructionsPage(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator;
    }

    @Override
    public void initialize() {
        // setup graphics on screen (background map, spritefont text)
        background = new TitleScreenMap();
        background.setAdjustCamera(false);
        instructionsLabel = new SpriteFont("Instructions", 15, 7, "Times New Roman", 30, Color.white);
        // createdByLabel = new SpriteFont("Main Menu: Press Space Bar to play the game.\n\nCharacter Selection: Use left and right arrows to select your player and press Enter.\n\nIn-Game Controls: Talk to NPC Serena with the Space Bar. Move around using arrow keys or A, W, S, D.\nCollect items to increase your health.\nUnlock the key to complete the game.\nTo attack zombies, collect the axe and press E to use it.", 120, 121, "Times New Roman", 20, Color.white);
        createdByLabel = new SpriteFont("Main Menu: Press Space Bar to play the game.", 113, 105, "Times New Roman", 20, Color.white);
        createdByLabel1 = new SpriteFont("Character Selection: Use left and right arrows to select your player and press Enter.", 113, 125, "Times New Roman", 20, Color.white);
        createdByLabel2 = new SpriteFont("In-Game Controls: Talk to the NPCs with the Space Bar.", 113, 145, "Times New Roman", 20, Color.white);
        createdByLabel3 = new SpriteFont("Walk around using arrow keys or run using A, W, S, D.", 113, 165, "Times New Roman", 20, Color.white);
        createdByLabel4 = new SpriteFont("Collect items to increase your health.", 148, 185, "Times New Roman", 20, Color.white);
        createdByLabel5 = new SpriteFont("Unlock the key to open up the portal.", 148, 205, "Times New Roman", 20, Color.white);
        createdByLabel6 = new SpriteFont("To attack enemies, collect the axe and press E to use it.", 148, 225, "Times New Roman", 20, Color.white);
        createdByLabel7 = new SpriteFont("Go to the portal to go to the next world.", 148, 245, "Times New Roman", 20, Color.white);
        returnInstructionsLabel = new SpriteFont("Press Space to return to the menu", 20, 532, "Times New Roman", 30, Color.white);
        keyLocker.lockKey(Key.SPACE);
    }

    public void update() {
        background.update(null);

        if (Keyboard.isKeyUp(Key.SPACE)) {
            keyLocker.unlockKey(Key.SPACE);
        }

        // if space is pressed, go back to main menu
        if (!keyLocker.isKeyLocked(Key.SPACE) && Keyboard.isKeyDown(Key.SPACE)) {
            screenCoordinator.setGameState(GameState.MENU);
        }
    }

    public void draw(GraphicsHandler graphicsHandler) {
        background.draw(graphicsHandler);
        instructionsLabel.draw(graphicsHandler);
        createdByLabel.draw(graphicsHandler);
        createdByLabel1.draw(graphicsHandler);
        createdByLabel2.draw(graphicsHandler);
        createdByLabel3.draw(graphicsHandler);
        createdByLabel4.draw(graphicsHandler);
        createdByLabel5.draw(graphicsHandler);
        createdByLabel6.draw(graphicsHandler);
        createdByLabel7.draw(graphicsHandler);
        returnInstructionsLabel.draw(graphicsHandler);
    }
}
