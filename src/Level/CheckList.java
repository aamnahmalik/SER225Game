package Level;

import Engine.GraphicsHandler;
import Engine.ImageLoader;
import EnhancedMapTiles.KeyPurple;
import GameObject.Sprite;
import GameObject.SpriteSheet;
import Maps.TestMap;
import SpriteFont.SpriteFont;
import java.awt.*;
import java.awt.image.BufferedImage;
import EnhancedMapTiles.Checkmark;
import EnhancedMapTiles.Portal;
import Maps.TestMap;
import Maps.TestMap;

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
    private Sprite LockedSymbol;
    private Sprite keyPurple;
    private Sprite Checkmark;
    private Sprite Checkmark2;
    private Sprite Checkmark3;
    private Sprite Checkmark4;
    private Sprite Portal;
    public int collectedItems;
    public int collectedWater;
    public int collectedFood;
    public int collectedFirstAidKit;
    public int collectedWeapon;
    public int collectedPortal;

    
    int transitionValue = Map.getMapTransition();
    int count = 0; 

    public CheckList(Map map) { 
        this.map = map; 
        text = new SpriteFont("Items: " + String.valueOf(count), fontX, fontTopY, "Arial", 12, Color.white);
        BufferedImage waterBottleImage = ImageLoader.load("WaterWhite.png");
        BufferedImage waterBottleImage2 = ImageLoader.load("Soda.jpeg");
        BufferedImage foodImage1 = ImageLoader.load("foodWhite.png");
        BufferedImage foodImage2 = ImageLoader.load("ChickenLeg.png");
        BufferedImage firstAidKitWhiteImage = ImageLoader.load("firstAidKitWhite.png");
        BufferedImage firstAidKitWhiteImage2 = ImageLoader.load("bandAid.png");
        BufferedImage axeWhiteImage = ImageLoader.load("AxeWhite.png");
        BufferedImage keyWhiteImage = ImageLoader.load("keyWhite.png");
        BufferedImage LockedSymbolImage = ImageLoader.load("lockedSymbol.png");
        BufferedImage keyPurpleImage = ImageLoader.load("keyPurple.png");
        BufferedImage CheckmarkImage = ImageLoader.load("Checkmark.png");
        BufferedImage PortalImage = ImageLoader.load("portal.png");

        
        if(transitionValue == 1)
        {
            food = new Sprite(foodImage2, x+22, topY + 2);
            food.setScale(.06f);
            firstAidKitWhite = new Sprite(firstAidKitWhiteImage2, x + 50, topY);
            firstAidKitWhite.setScale(.7f);
            waterBottle = new Sprite(waterBottleImage2, x , topY );
        }
        else 
        {
            food = new Sprite(foodImage1, x +25, topY + 3);
            food.setScale(.4f);
            firstAidKitWhite = new Sprite(firstAidKitWhiteImage, x + 50, topY);
            firstAidKitWhite.setScale(.7f);
            waterBottle = new Sprite(waterBottleImage, x , topY );
        }

        axeWhite = new Sprite(axeWhiteImage, x+77, topY);
        axeWhite.setScale(.9f);
        keyWhite = new Sprite(keyWhiteImage, x+95, topY +3);
        keyPurple = new Sprite(keyPurpleImage, x+95, topY +4);
        LockedSymbol = new Sprite(LockedSymbolImage, x+97, topY+3);
        LockedSymbol.setScale(.04f);
        Checkmark = new Sprite(CheckmarkImage, x, topY);
        Checkmark.setScale(.1f);
        Checkmark2= new Sprite(CheckmarkImage, x+25, topY);
        Checkmark2.setScale(.1f);
        Checkmark3 = new Sprite(CheckmarkImage, x+50, topY);
        Checkmark3.setScale(.1f);
        Checkmark4 = new Sprite(CheckmarkImage, x+75, topY);
        Checkmark4.setScale(.1f);
        Portal = new Sprite (PortalImage, x-100, topY);

        
        
    }
   
        
        //super(id, location.x, location.y, new SpriteSheet(ImageLoader.load("Water.png"), 69, 90), "STAND_LEFT");

    public void itemCollected () { 
        collectedItems = collectedItems +1;
        update();

        if (collectedItems == 4)
        { 
            KeyPurple keyPurple = new KeyPurple (map.getMapTile(2, 2).getLocation(),map);
            keyPurple.setMap(map);
            map.enhancedMapTiles.add(keyPurple);


            //System.out.println("4 items have been collected");
        }

        if ((collectedItems ==5) && (Map.getMapTransition() == 0)) {
            
            Portal portal = new Portal (map.getMapTile(4, 7).getLocation(),map);
            portal.setMap(map);
            map.enhancedMapTiles.add(portal);
            
        }
    }


    public void waterCollected () { 
        collectedWater = collectedWater +1;
        update();

        if (collectedWater ==1) 
        { 
            Checkmark checkmark = new Checkmark (map.getMapTile(0,2).getLocation(),map);
            checkmark.setMap(map);
        }
    }

    public void foodCollected () {
        collectedFood = collectedFood +1;
        update(); 

        if (collectedFood ==1);
        {
            Checkmark checkmark2 = new Checkmark (map.getMapTile(0,2).getLocation(),map);
            checkmark2.setMap(map);
        }
    }

    public void firstAidKitCollected () { 
        collectedFirstAidKit = collectedFirstAidKit +1;
        update();

        if (collectedFirstAidKit ==1);
        {
            Checkmark checkmark3 = new Checkmark (map.getMapTile(0,2).getLocation(),map);
            checkmark3.setMap(map);
        }
    }

    public void weaponCollected () { 
        collectedWeapon = collectedWeapon +1;
        update();

        if (collectedWeapon ==1);
        {
            System.out.println("weapon is collected");
            Checkmark checkmark4 = new Checkmark (map.getMapTile(0,2).getLocation(),map);
            checkmark4.setMap(map);
        }
    }

    public void portalCollected ()  {
        collectedPortal = collectedPortal + 1;
        update(); 

        if (collectedPortal ==1)
        {
            System.out.println("portal is collceted");
            //change logic to get screen to switch when portal is touched 

        }
    }





    // public void waterCollected () {
    //     protected boolean collectedWater = false; 
    //     Checkmark.isHidden = true;
    //     update();

    //     if (collectedWater == true) { 
    //         this.isHidden = false;
    //     }
    // }



    public int getCollectedItems() {
        return collectedItems;
    }

    public int getCollectedWater() {
        return collectedWater;
    }

    public int getCollectedFood() {
        return collectedFood;
    }

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
            //Checkmark.draw(graphicsHandler);
            
            //if items collected = 4 unlockedsymbol
            //if items collected = less than 4 locked symbol 
        
            if (collectedItems >= 4)
            { 
                keyWhite.draw(graphicsHandler);
                keyPurple.draw(graphicsHandler);
            }
            else 
            { 
                LockedSymbol.draw(graphicsHandler);
            }

            if (collectedWater >=1) 
            { 
                Checkmark.draw(graphicsHandler);
            }

            if (collectedFood >=1) {
                Checkmark2.draw(graphicsHandler);
            }

            if (collectedFirstAidKit >=1) {
                Checkmark3.draw(graphicsHandler);
            }

            if (collectedWeapon >= 1) {
                Checkmark4.draw(graphicsHandler);
            }
            
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