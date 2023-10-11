package Players;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import GameObject.SpriteSheet;
import Level.Player;

import java.util.HashMap;

// This is the class for the Chuck player character
// basically just sets some values for physics and then defines animations
public class BlairCopy  extends Player {

    public BlairCopy(float x, float y) {
        super(
                new SpriteSheet(ImageLoader.load("BlairWorking.png"), 32, 32),  x, y, "STAND_RIGHT");
                walkSpeed = 2.3f;
    }

    public void update() {
        super.update();
    }

    public void draw(GraphicsHandler graphicsHandler) {
        super.draw(graphicsHandler);
    }

    @Override
    public HashMap<String, Frame[]> loadAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("STAND_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            .withScale(6)
                            .build()
            });

            put("STAND_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            .withScale(6)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .build()
            });

            put("WALK_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 7), 14)
                            .withScale(6)
                            .build()
            });

            put("WALK_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(3, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 7), 14)
                            .withScale(6)
                            .build()
            });

            put("RUN_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(3, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 7), 14)
                            .withScale(6)
                            .build()
            });

            put("RUN_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 7), 14)
                            .withScale(6)
                            .build()
            });
            put("WALK_UP", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(1, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 7), 14)
                            .withScale(6)
                            .build()
            });
            put("WALK_DOWN", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 7), 14)
                            .withScale(6)
                            .build()
            });
            put("RUN_UP", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(1, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 7), 14)
                            .withScale(6)
                            .build()
            });
            put("RUN_DOWN", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 2), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 3), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 4), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 5), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 6), 14)
                            .withScale(6)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 7), 14)
                            .withScale(6)
                            .build()
            });
        }};
    }
}

