package NPCs;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import GameObject.SpriteSheet;
import Level.NPC;
import Utils.Point;

import java.util.HashMap;

public class Player2 extends NPC 
{
    public Player2(int id, Point location) 
    {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("zombie2.png"), 35, 50), "STAND_LEFT");
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
                            .withScale(1)
                            .withBounds(7, 13, 11, 7)
                            .build()
                });
                put("STAND_RIGHT", new Frame[] 
                {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            .withScale(1)
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
