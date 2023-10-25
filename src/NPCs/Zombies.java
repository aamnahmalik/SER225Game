package NPCs;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.SpriteSheet;
import Level.NPC;
import Level.Player;
import Utils.Direction;
import Utils.Point;

import java.util.HashMap;
import java.util.Random;

public class Zombies extends NPC 
{
    private Direction currentDirection;
    private int directionChangeDelay;
    private int directionChangeCounter;
    private Random random = new Random();

    public Zombies(int id, Point location) 
    {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("Zombie11.png"), 24, 32), "STAND_LEFT");
        directionChangeDelay = random.nextInt(1500) + 500;
        directionChangeCounter = directionChangeDelay;
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
                case 3:
                    currentDirection = Direction.DOWN;
            }
    }

    public void update(Player player) 
    {
        super.update(player);

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
                case 3:
                    currentDirection = Direction.DOWN;
            }

            directionChangeCounter = directionChangeDelay;
        }

        this.walk(currentDirection, 0.2f);
    }

    @Override
    public HashMap<String, Frame[]> loadAnimations(SpriteSheet spriteSheet) 
    {
        return new HashMap<String, Frame[]>() 
        {
            {
                put("STAND_LEFT", new Frame[] 
                {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build()
                });
                put("STAND_RIGHT", new Frame[] 
                {
                    new FrameBuilder(spriteSheet.getSprite(1, 0))
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build()
                });

                put("WALK_LEFT", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(1, 0), 14)
                            .withScale(2)
                            .withBounds(7, 17, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 1), 14)
                            .withScale(2)
                            .withBounds(7, 17, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 2), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build()
                });

                put("WALK_RIGHT", new Frame[]
                {
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 1), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 2), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build()
                });

                put("WALK_UP", new Frame[]
                {
                    new FrameBuilder(spriteSheet.getSprite(3, 0), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 1), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(3, 2), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build()
                });
                put("WALK_DOWN", new Frame[]
                {
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 2), 14)
                            .withScale(2)
                            .withBounds(7, 13, 20, 30)
                            .build()
                });
        }};
    }

    @Override
    public void draw(GraphicsHandler graphicsHandler) 
    {
        super.draw(graphicsHandler);
    }
}
