package Level;

import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Sprite;
import GameObject.SpriteSheet;
import SpriteFont.SpriteFont;
import java.awt.*;
import java.awt.image.BufferedImage;
//Represents the game's textbox for the checklist 
//will display the text it is given to its textQueue 
//each String in the textQueue will be displayed in the textbox, and hitting the interact key will cycle between additional Strings 
//use the newline character in a String in the textQueue to break the text up into a second line if needed 
public class CheckList { 
    protected boolean isActive = true; 
    //moves box right and left 
    protected final int x = 680; 
    protected final int bottomY = 500; 
    protected final int topY = 4; 
    //moves text left and right
    protected final int fontX = 730; 
    protected final int fontBottomY = 519; 
    protected final int fontTopY = 13; 
    //makes box longer 
    protected final int width = 115; 
    //makes box taller 
    protected final int height = 30; 

    private SpriteFont text = null; 
    private Map map; 
    private Sprite waterBottle;
    private Sprite food;
    private Sprite firstAidKitWhite;
    private Sprite axeWhite;
    private Sprite keyWhite;

    int count = 0; 

    public CheckList(Map map) { 
        this.map = map; 
        text = new SpriteFont("Items: " + String.valueOf(count), fontX, fontTopY, "Arial", 12, Color.white);
        BufferedImage waterBottleImage = ImageLoader.load("WaterWhite.png");
        BufferedImage foodImage = ImageLoader.load("foodWhite.png");
        BufferedImage firstAidKitWhiteImage = ImageLoader.load("firstAidKitWhite.png");
        BufferedImage axeWhiteImage = ImageLoader.load("AxeWhite.png");
        BufferedImage keyWhiteImage = ImageLoader.load("keyWhite.png");

        waterBottle = new Sprite(waterBottleImage, x , topY );
        food = new Sprite(foodImage, x +25, topY + 3);
        food.setScale(.4f);
        firstAidKitWhite = new Sprite(firstAidKitWhiteImage, x + 50, topY);
        firstAidKitWhite.setScale(.7f);
        axeWhite = new Sprite(axeWhiteImage, x+77, topY);
        axeWhite.setScale(.9f);
        keyWhite = new Sprite(keyWhiteImage, x+95, topY +3);
        
    }
        //super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("Water.png"), 69, 90), "STAND_LEFT");


    public void addItem (int item) { 
        item = item + item; 
        update();
    }

    public int getCheckList() { 
        return count; 
    }

    public void setCheckList (int count) { 
        this.count = count;
    }

    public void update() { 
        if(!map.getCamera().isAtBottomOfMap()){
            //text = new SpriteFont("Items: " + String.valueOf(count), fontX, fontTopY, "Arial", 12, Color.white);
        }
        // else { 
        //     text = new SpriteFont("Items: " + String.valueOf(count), fontX, fontBottomY, "Arial", 12, Color.white);
        // }
    }

    public void draw(GraphicsHandler graphicsHandler) { 
        //if camera is at bottom of screen, textbox is drawn at top of screen instead of the bottom like usual
        //to prevent it from covering the player 
        // if (!map.getCamera().isAtBottomOfMap()) { 
            update(); 
            graphicsHandler.drawFilledRectangleWithBorder(x, topY, width, height, Color.white, Color.white, 2);
            text.draw(graphicsHandler);
            waterBottle.draw(graphicsHandler);
            food.draw(graphicsHandler);
            firstAidKitWhite.draw(graphicsHandler);
            axeWhite.draw(graphicsHandler);
            keyWhite.draw(graphicsHandler);
        // }
        // else { 
        //     update();
        //     graphicsHandler.checkListTile(x, topY, width, height, Color.black, Color.white, borderThickness:2);
        //     text.draw(graphicsHandler);
        // }
        // else { 
        //     update(); 
        //     graphicsHandler.checkListTile(x, bottomY, width, height, Color.black, Color.white, 2);
        //     text.draw(graphicsHandler);
        // }
    }

    public boolean isActive() { 
        return isActive; 
    }

    public void setIsActive(boolean isActive) { 
        this.isActive = isActive;
    }
}