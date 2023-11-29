package Scripts.TestMap;

import Level.EnhancedMapTile;
import Level.Script;
import Level.ScriptState;
import Utils.Direction;
import Engine.Key;
import Engine.Keyboard;
import EnhancedMapTiles.FirstAidKit;

public class Item1Script extends Script<EnhancedMapTile>
{
    private int sequence = 0;
    private int selectedOption = -1;

    @Override
    protected void setup() {

            if (sequence == 0) {
                lockPlayer();
                selectedOption = -1;
                showTextbox();
                addTextToTextboxQueue( "Blair married the prince of which country?");
                addTextToTextboxQueue( "1. Monaco\t 2. France\t 3. Sweden");            

            }
            else if (sequence == 1) {
             
            }
            else if (sequence == 2) {
                if (selectedOption == 0)
                {
                    addTextToTextboxQueue("Correct!");
                    showTextbox();
                }
                else if (selectedOption == 1)
                {
                    addTextToTextboxQueue("Wrong!");
                    showTextbox();
                }
                else if (selectedOption == 2)
                {
                    addTextToTextboxQueue("Wrong!");
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
            if (selectedOption == 0)
            {
                map.setHasChangedHealthMeter(true);
                this.map.getCheckList().itemCollected();
                this.map.getCheckList().firstAidKitCollected();
                for (EnhancedMapTile emt : map.getEnhancedMapTiles()) {
                    if (emt instanceof FirstAidKit) {
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