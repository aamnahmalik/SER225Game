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
public class Chuck extends Player {

    public Chuck(float x, float y) {
        super(
                new SpriteSheet(ImageLoader.load("ChuckBackground.png"), 32, 32),  x, y, "STAND_RIGHT");
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
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
    
                put("STAND_LEFT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(0, 0))
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                                .build()
                });

                put("STAND_AXL", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(34, 0))
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                                .build()
                });
    
                put("WALK_RIGHT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(2, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
    
                put("WALK_LEFT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(3, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
    
                put("RUN_LEFT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(3, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
    
                put("RUN_RIGHT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(2, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
                put("WALK_UP", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(1, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
                put("WALK_DOWN", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(0, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
                put("RUN_UP", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(1, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });
                put("RUN_DOWN", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(0, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 5), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 7), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build()
                });

                put("ATTACK_FRONT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(32, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(32, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(32, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(32, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(32, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                });
                
                put("ATTACK_BACK", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(33, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(33, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(33, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(33, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(33, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                });
                put("ATTACK_RIGHT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(34, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(34, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(34, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(34, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(34, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                });
                put("ATTACK_LEFT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(35, 0), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(35, 1), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(35, 2), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(35, 3), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(35, 4), 14)
                                .withScale(3)
                                .withBounds(8, 12, 16, 20)
                                .build(),
                });
        }};
    }
}

