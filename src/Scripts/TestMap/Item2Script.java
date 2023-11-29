package Scripts.TestMap;

import Level.EnhancedMapTile;
import Level.Script;
import Level.ScriptState;
import Engine.Key;
import Engine.Keyboard;
import EnhancedMapTiles.Food;

public class Item2Script extends Script<EnhancedMapTile>
{
    private int sequence = 0;
    private int selectedOption = -1;

    @Override
    protected void setup() {

            if (sequence == 0) {
                lockPlayer();
                selectedOption = -1;
                showTextbox();
                addTextToTextboxQueue( "What was Serena's dream school?\n(Press Space to see options)");
                addTextToTextboxQueue( "1. Yale\t 2. Columbia\t 3. Princeton\nPress Space, then the number of your answer");            

            }
            else if (sequence == 1) {
             
            }
            else if (sequence == 2) {
                if (selectedOption == 2)
                {
                    addTextToTextboxQueue("Correct!\nPress Space to exit.");
                    showTextbox();
                }
                else if (selectedOption == 0)
                {
                    addTextToTextboxQueue("Wrong!\nPress Space to try again.");
                    showTextbox();
                }
                else if (selectedOption == 1)
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
            if (selectedOption == 2)
            {
                map.setHasChangedHealthMeter(true);
                this.map.getCheckList().itemCollected();
                this.map.getCheckList().foodCollected();
                for (EnhancedMapTile emt : map.getEnhancedMapTiles()) {
                    if (emt instanceof Food) {
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