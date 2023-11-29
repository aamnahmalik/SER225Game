package Scripts.TestMap;

import Level.*;

// script for talking to dino npc
// the script is segmented -- it has multiple setups, cleanups, and executions based on its current action
public class Reference extends Script {

    private int sequence = 0;

    @Override
    protected void setup() {
        lockPlayer();
        if (sequence == 0) {
            showTextbox();
            addTextToTextboxQueue("Hi Aaanah");
        }
        else if (sequence == 1) {
            showTextbox();
            addTextToTextboxQueue("Hi Tess");
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
    }

    @Override
    public ScriptState execute() {
        // talks
        if (sequence == 0) {
            start();
            if (isTextboxQueueEmpty()) {
                end();
            }
        }
        // talks more
        else if (sequence == 1) {
            start();
            if (isTextboxQueueEmpty()) {
                end();
            }
        }
        else {
            return ScriptState.COMPLETED;
        }
        return ScriptState.RUNNING;
    }
}

