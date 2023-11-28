package Scripts.TestMap;

import Level.EnhancedMapTile;
import Level.Script;
import Level.ScriptState;

import Engine.Key;
import Engine.Keyboard;

public class Item1Script extends Script<EnhancedMapTile>
{
    private int selectedOption = 0;
    private String[] options = {"Monaco", "France", "Sweden"};

    @Override
    protected void setup() {
        lockPlayer();
        showTextbox();
        
        if (!isFlagSet("hasCollectedItem1")) 
        {
            addTextToTextboxQueue("Blair married the prince of which country?");
            addTextToTextboxQueue("1. Monaco\t 2. France\t 3. Sweden");

            if (Keyboard.isKeyDown(Key.LEFT) && selectedOption > 0) 
            {
                selectedOption--;
            } 
            else if (Keyboard.isKeyDown(Key.RIGHT) && selectedOption < options.length - 1) 
            {
                selectedOption++;
            } 
            else if (Keyboard.isKeyDown(Key.ENTER)) 
            {
                handleOptionSelection(selectedOption);
            }
        }

    }

    @Override
    protected void cleanup() {
        unlockPlayer();
        hideTextbox();
    }

    @Override
    public ScriptState execute() {
        start();

        if (!isTextboxQueueEmpty()) {
            return ScriptState.RUNNING;
        }

        if (Keyboard.isKeyDown(Key.ONE)) {
            selectedOption = 1;
        } else if (Keyboard.isKeyDown(Key.TWO)) {
            selectedOption = 2;
        } else if (Keyboard.isKeyDown(Key.THREE)) {
            selectedOption = 3;
        }
        
        handleOptionSelection(selectedOption);

        if (isWaitTimeUp()) {
            end();
            return ScriptState.COMPLETED;
        }

        return ScriptState.RUNNING;
    }
 
    // private void handleInput() {

    //     if (Keyboard.isKeyDown(Key.ONE)) {
    //         selectedOption = 1;
    //     } else if (Keyboard.isKeyDown(Key.TWO)) {
    //         selectedOption = 2;
    //     } else if (Keyboard.isKeyDown(Key.THREE)) {
    //         selectedOption = 3;
    //     }
        
    //     handleOptionSelection(selectedOption);

    // }

    private void handleOptionSelection(int selectedOptionIndex) {
        switch (selectedOptionIndex) {
            case 0:
                setFlag("hasCollectedItem1");
                cleanup();
                break;
            case 1:
                cleanup();
                break;
            case 2:
                cleanup();
                break;
        }
        setWaitTime(0); // Finish the script immediately after option selection
    }
}