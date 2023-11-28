 package NPCs;

import java.util.HashMap;
import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.SpriteSheet;
import Level.NPC;
import Level.Player;
import Utils.Point;

public class NightSky extends NPC {
    
    public NightSky(int id, Point location) {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("nightsky.png"), 900, 540), "STAND_LEFT");
    }

    public void update(Player player) {
        super.update(player);
    }

    @Override
    public HashMap<String, Frame[]> loadAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
           put("STAND_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            // .withScale(.8f)
                            .withBounds(0,0, 900, 540)
                            .build()
            });
        }};
    }
    @Override
    public void draw(GraphicsHandler graphicsHandler) {
        super.draw(graphicsHandler);
     }
    }
    
     


