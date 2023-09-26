package NPCs;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import GameObject.SpriteSheet;
import Level.NPC;
import Level.Player;
import Utils.Point;

import java.util.HashMap;

public class Zombies extends NPC 
{
    public Zombies(int id, Point location) 
    {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("zombie2.png"), 30, 35), "STAND_LEFT");
    }

    public void update(Player player) 
    {
        super.update(player);
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
                            .withBounds(7, 13, 11, 7)
                            .build()
                });
                put("STAND_RIGHT", new Frame[] 
                {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            .withScale(2)
                            .withBounds(7, 13, 11, 7)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .build()
                });
            }
        };
    }

    @Override
    public void draw(GraphicsHandler graphicsHandler) 
    {
        super.draw(graphicsHandler);
    }
}
