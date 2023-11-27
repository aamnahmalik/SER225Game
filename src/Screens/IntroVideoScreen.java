package Screens;

import java.awt.*;
import java.awt.image.BufferedImage;

import Engine.GraphicsHandler;
import Engine.ImageLoader;
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
    private IntroVideoSequence videoSequence; // Add this variable

    public IntroVideoScreen(PlayLevelScreen playLevelScreen, boolean isChuckSelected) {
        this.playLevelScreen = playLevelScreen;
        this.isChuckSelected = isChuckSelected;
        
        // Initialize the video sequence with 229 frames and a delay of 200 milliseconds (0.2 seconds)
        videoSequence = new IntroVideoSequence(229, 200);

        // Load and add frames to the video sequence
        for (int i = 0; i < 50; i++) {
            if(i < 10 || i >= 100)
            {
                String framePath = "IntroVideoBlair/frame_" + i + "_delay-0.2s.png"; // Adjust the path as needed
                BufferedImage frame = ImageLoader.load(framePath); // Implement a method to load images
                videoSequence.addFrame(frame, i);
            }
            else
            {
                String framePath = "IntroVideoBlair/frame_0" + i + "_delay-0.2s.png"; // Adjust the path as needed
                BufferedImage frame = ImageLoader.load(framePath); // Implement a method to load images
                videoSequence.addFrame(frame, i);
            }
        }
    }
    public void initialize() {
        //screenCoordinator = new ScreenCoordinator();

    }

    public void update() {

         // Update the video sequence
         videoSequence.update();

        //Transition to another screen when Enter is pressed
        if (Keyboard.isKeyDown(Key.ENTER)) {
            playLevelScreen.setGameState(PlayLevelScreenState.RUNNING);
        } //set up the isChuckSelected value
        
    }
    public void draw(GraphicsHandler graphicsHandler) {
         // Draw the current frame of the video sequence
        BufferedImage currentFrame = videoSequence.getCurrentFrame();
        if (currentFrame != null) {
            graphicsHandler.drawImage(currentFrame, 0, 0);
        }
    }
}