package Scripts.TestMap;

import Level.EnhancedMapTile;
import Level.Script;
import Level.ScriptState;
import Engine.Key;
import Engine.Keyboard;
import EnhancedMapTiles.Weapon;

public class Item4Script extends Script<EnhancedMapTile>
{
    private int sequence = 0;
    private int selectedOption = -1;

    @Override
    protected void setup() {

            if (sequence == 0) {
                lockPlayer();
                selectedOption = -1;
                showTextbox();
                addTextToTextboxQueue( "Who was Dan's sister?\n(Press Space to see options)");
                addTextToTextboxQueue( "1. Vanessa\t 2. Jenny\t 3. Liv\nPress Space, then the number of your answer");            

            }
            else if (sequence == 1) {
             
            }
            else if (sequence == 2) {
                if (selectedOption == 1)
                {
                    addTextToTextboxQueue("Correct!\nPress Space to exit.");
                    showTextbox();
                }
                else if (selectedOption == 0)
                {
                    addTextToTextboxQueue("Wrong!\nPress Space to try again.");
                    showTextbox();
                }
                else if (selectedOption == 2)
                {
                    addTextToTextboxQueue("Wrong!\nPress Space to try again.");
                    showTextbox();
                }
            }
        
        
            
    }

    @Override
    protected void cleanup() {
        if (sequence == 0) {
            hideTextbox();
            sequence++;
        }
        else if (sequence == 1) {
            hideTextbox();
            sequence++;
        }
        else if (sequence == 2) {
            hideTextbox();
            sequence++;
            unlockPlayer();
            if (selectedOption == 1)
            {
                map.setHasChangedHealthMeter(true);
                this.map.getCheckList().itemCollected();
                this.map.getCheckList().weaponCollected();
                for (EnhancedMapTile emt : map.getEnhancedMapTiles()) {
                    if (emt instanceof Weapon) {
                        emt.setIsHidden(true);
                        break;
                    }
                }
            }
            else
            {
                sequence = 0;
            }
        }
    }

    @Override
    public ScriptState execute() {
        // talks
        if (sequence == 0) {
            start();
            if (!isTextboxQueueEmpty()) {
                return ScriptState.RUNNING;
            }
            end();
        }
        // talks more
        else if (sequence == 1) {
            start();
            if(Keyboard.isKeyDown(Key.ONE))
            {
                selectedOption = 0;
                end();


            }
            else if(Keyboard.isKeyDown(Key.TWO))
            {
                selectedOption = 1;
                                end();


            }
            else if(Keyboard.isKeyDown(Key.THREE))
            {
                selectedOption = 2;
                                end();


            }
        }
        else if (sequence == 2)
        {
            start();
            if (!isTextboxQueueEmpty()) {
                return ScriptState.RUNNING;
            }
            end();
        }
        
        else {
            return ScriptState.COMPLETED;
        }
        return ScriptState.RUNNING;
    }
}