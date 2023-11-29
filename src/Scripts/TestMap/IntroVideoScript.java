package Scripts.TestMap;

import Level.Script;
import Level.ScriptState;
import Utils.Direction;

// script for talking to dino npc
// the script is segmented -- it has multiple setups, cleanups, and executions based on its current action
public class IntroVideoScript extends Script {

    private int sequence = 0;
    private int amountMoved = 0;

    @Override
    protected void setup() {

        if (sequence == 0) {
            showTextbox();
            addTextToTextboxQueue( "What am I doing here?");
        }
        else if (sequence == 1) {
            showTextbox();
            addTextToTextboxQueue( "Why is it so dark?");            
        }
        else if (sequence == 2) {
            showTextbox();
            addTextToTextboxQueue( "Why can I see my health level?");            
        }
        else if (sequence == 3) {
            showTextbox();
            addTextToTextboxQueue( "Items?? A lock? I am so confused");
            addTextToTextboxQueue( "I guess I have to find all this stuff. It looks like \nsomeone put me here on purpose...");     
        }
        else if (sequence == 4) {
            showTextbox();
            addTextToTextboxQueue( "I see something...Let's try to go to this way");
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
        }
        else if (sequence == 3) {
            hideTextbox();
            sequence++;
        }
        else if (sequence == 4) {
            hideTextbox();
            sequence++;
            unlockPlayer();
        }
    }

    @Override
    public ScriptState execute() {
        // talks
        if (sequence == 0) {
            start();
            if (isTextboxQueueEmpty()) {
                player.walk(Direction.LEFT, 2);
                amountMoved += 1;
                if (amountMoved == 95) {
                    amountMoved = 0;
                    end();
                }
            }
        }
        // talks more
        else if (sequence == 1) {
            start();
            if (isTextboxQueueEmpty()) {
                player.walk(Direction.UP, 2);
                amountMoved += 1;
                if (amountMoved == 140) {
                    amountMoved = 0;
                    end();
                }
            }
        }

        else if (sequence == 2) {
            start();
            if (isTextboxQueueEmpty()) {
                player.walk(Direction.RIGHT, 2);
                amountMoved += 1;
                if (amountMoved == 278) {
                    amountMoved = 0;
                    end();
                }
            }
        }
        else if (sequence == 3) {
            start();
            if (isTextboxQueueEmpty()) {
                player.walk(Direction.DOWN, 2);
                amountMoved += 1;
                if (amountMoved == 130) {
                    amountMoved = 0;
                    end();
                }
            }
        }
        else if (sequence == 4) {
            start();
            if (isTextboxQueueEmpty()) {
                player.walk(Direction.RIGHT, 2);
                amountMoved += 1;
                if (amountMoved == 100) {
                    end();
                }
            }
        }
        
        else {
            return ScriptState.COMPLETED;
        }
        return ScriptState.RUNNING;
    }
}

