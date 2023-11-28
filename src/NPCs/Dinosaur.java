package NPCs;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import GameObject.SpriteSheet;
import Level.NPC;
import Level.Player;
import Utils.Direction;
import Utils.Point;

import java.util.HashMap;
import java.util.Random;

import java.util.HashMap;

// This class is for the dinosaur NPC
public class Dinosaur extends NPC 
{
        private Direction currentDirection;
        private int directionChangeDelay;
        private int directionChangeCounter;
        private Random random = new Random();
        private boolean hasInteracted = false;

        public Dinosaur(int id, Point location) 
        {
                super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("dinos.png"), 95, 59), "STAND_LEFT");
                directionChangeDelay = random.nextInt(1500) + 500;
                directionChangeCounter = directionChangeDelay;
                this.isUpdateOffScreen = true;
                int newDirection = random.nextInt(4);
            
                switch (newDirection) 
                {
                        case 0:
                        currentDirection = Direction.LEFT;
                        break;
                        case 1:
                        currentDirection = Direction.RIGHT;
                        break;
                        case 2:
                        currentDirection = Direction.UP;
                        break;
                        case 4:
                        currentDirection = Direction.DOWN;
                }
        }

        public void update(Player player) 
        {
                super.update(player);

                if (player.overlaps(this) && !hasInteracted) {
                        int healthDecreaseAmount = 20; 
                        
                        map.getHealthMeter().minusHealth(healthDecreaseAmount);
                
                        map.setHasChangedHealthMeter(true);
                        hasInteracted = true;
                }

                directionChangeCounter--;

                if (directionChangeCounter <= 0) 
                {
                int newDirection = random.nextInt(4);
                
                switch (newDirection) 
                {
                        case 0:
                        currentDirection = Direction.LEFT;
                        break;
                        case 1:
                        currentDirection = Direction.RIGHT;
                        break;
                        case 2:
                        currentDirection = Direction.UP;
                        break;
                        case 4:
                        currentDirection = Direction.DOWN;
                }

                directionChangeCounter = directionChangeDelay;
                }

                this.walk(currentDirection, 0.5f);
        }

        @Override
        public HashMap<String, Frame[]> loadAnimations(SpriteSheet spriteSheet) {
                return new HashMap<String, Frame[]>() {{
                put("STAND_LEFT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(1, 0))
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build()
                });
                put("STAND_RIGHT", new Frame[] {
                        new FrameBuilder(spriteSheet.getSprite(2, 0))
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build()
                });

                put("WALK_LEFT", new Frame[]{
                        new FrameBuilder(spriteSheet.getSprite(1, 0), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 1), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(1, 2), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build()
                });

                put("WALK_RIGHT", new Frame[]{
                        new FrameBuilder(spriteSheet.getSprite(2, 0), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 1), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(2, 2), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build()
                });

                put("WALK_UP", new Frame[]{
                        new FrameBuilder(spriteSheet.getSprite(3, 0), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 1), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(3, 2), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build()
                });

                put("WALK_DOWN", new Frame[]{
                        new FrameBuilder(spriteSheet.getSprite(0, 0), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 1), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build(),
                        new FrameBuilder(spriteSheet.getSprite(0, 2), 14)
                                .withScale(1)
                                .withBounds(26, 3, 42, 52)
                                .build()
                });
        }};
         }

        @Override
        public void draw(GraphicsHandler graphicsHandler) {
        super.draw(graphicsHandler);
        }
}
