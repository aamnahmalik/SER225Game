package Maps;

import java.util.ArrayList;

import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.ImageEffect;
import GameObject.Sprite;
import Level.Map;
import Level.NPC;
import NPCs.NightSky;
import NPCs.Serena;
import NPCs.Zombies;
import Scripts.TestMap.SerenaScript;
import Tilesets.CommonTileset;
import Utils.Colors;
import Utils.Point;

// Represents the map that is used as a background for the main menu and credits menu screen
public class TitleScreenMap extends Map {

    private Sprite cat;
    private Sprite background;

    public TitleScreenMap() {
        super("title_screen_map.txt", new CommonTileset());
        Point catLocation = getMapTile(9, 7).getLocation().subtractX(6).subtractY(7);
        Point backgroundLocation = getMapTile(2,0).getLocation().subtractX(1).subtractY(2);
        cat = new Sprite(ImageLoader.loadSubImage("SerenaPurple.png", Colors.MAGENTA, 0, 0, 86, 99));
        cat.setScale(2);
        cat.setImageEffect(ImageEffect.FLIP_HORIZONTAL);
        cat.setLocation(catLocation.x, catLocation.y);
        background = new Sprite(ImageLoader.loadSubImage("nightsky.png", Colors.MAGENTA, 0, 0, 623, 525));
        background.setScale(1);
        background.setImageEffect(ImageEffect.FLIP_HORIZONTAL);
        background.setLocation(backgroundLocation.x, backgroundLocation.y);
    }

    @Override
    public void draw(GraphicsHandler graphicsHandler) {
        super.draw(graphicsHandler);
        background.draw(graphicsHandler);
        // cat.draw(graphicsHandler);
    }
}