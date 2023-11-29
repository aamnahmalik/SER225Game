package NPCs;

import Builders.FrameBuilder;
import Engine.BackgroundMusic;
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
    private boolean hasInteracted = false;
    protected BackgroundMusic backgroundMusic;

    public Zombies(int id, Point location) 
    {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("Zombie11.png"), 24, 32), "STAND_LEFT");
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
                case 3:
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

                backgroundMusic = new BackgroundMusic("Resources/Damage.wav");
                backgroundMusic.play(); // Start playing the background music

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                backgroundMusic.stop();

        }

        // if (player.overlaps(this) && player.isAttacking()) {
                
        //         this.isHidden = true;
        // }

        Point playerLocation = player.getLocation();
        Point zombie1L = this.getLocation();

        if (player.isAttacking() && (((Math.abs(playerLocation.x - zombie1L.x) >= 26) && (Math.abs(playerLocation.x - zombie1L.x) <= 39))
            || 
            ((Math.abs(playerLocation.y - zombie1L.y) <= 47) && (Math.abs(playerLocation.y-zombie1L.y) >= 34)))) {
                this.isHidden = true;
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
