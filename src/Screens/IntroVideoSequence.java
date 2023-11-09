package Screens;
import java.awt.image.BufferedImage;

public class IntroVideoSequence {
    BufferedImage[] frames; // Array to store the images
    private int currentFrame; // Index of the currently displayed frame
    private long lastFrameTime; // Time of the last frame change
    private long frameDelay; // Delay between frames in milliseconds

    public IntroVideoSequence(int frameCount, long frameDelay) {
        frames = new BufferedImage[frameCount];
        this.frameDelay = frameDelay;
        currentFrame = 0;
        lastFrameTime = System.currentTimeMillis();
    }

    public void addFrame(BufferedImage frame, int index) {
        if (index >= 0 && index < frames.length) {
            frames[index] = frame;
        }
    }

    public void update() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastFrameTime >= frameDelay) {
            currentFrame++;
            if (currentFrame >= frames.length) {
                // All frames have been shown
                currentFrame = 0;
            }
            lastFrameTime = currentTime;
        }
    }

    public BufferedImage getCurrentFrame() {
        return frames[currentFrame];
    }
}
