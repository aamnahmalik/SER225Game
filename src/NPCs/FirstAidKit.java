package NPCs;

import java.util.HashMap;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.SpriteSheet;
import Level.NPC;
import Utils.Point;

public class FirstAidKit extends NPC {

     public FirstAidKit(int id, Point location) {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("firstaidkit.png"), 40, 40), "STAND_LEFT");
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
           put("STAND_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0))
                            .withScale(1)
                            .withBounds(5, 6, 5, 10)
                            .build()
            });
        }};
    }

 }

