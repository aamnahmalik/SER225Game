package EnhancedMapTiles;

import java.util.HashMap;
import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.SpriteSheet;
import Level.EnhancedMapTile;
import Level.NPC;
import Utils.Point;

public class WaterCheckList /*extends EnhancedMapTile*/ {
/* 
     public WaterCheckList (int id, Point location) {
        super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("Water.png"), 24, 31), "STAND_LEFT");
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
*/
 }
