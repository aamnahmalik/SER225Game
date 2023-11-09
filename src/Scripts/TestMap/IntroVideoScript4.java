package Scripts.TestMap;

import Level.NPC;
import Level.Script;
import Level.ScriptState;

// script for talking to Serena npc
public class IntroVideoScript4 extends Script {
    @Override
    protected void setup() {
        lockPlayer();
        showTextbox();

        // changes what walrus says when talking to him the first time (flag is not set) vs talking to him afterwards (flag is set)
        if (!isFlagSet("enter4")) {
        
            addTextToTextboxQueue( "Items?? A lock? I am so confused");
            addTextToTextboxQueue( "I guess I have to find all this stuff. It looks like \nsomeone put me here on purpose...");                    
        }
        else {
        }
    
    }

    @Override
    protected void cleanup() {
        unlockPlayer();
        hideTextbox();

        // set flag so that if walrus is talked to again after the first time, what he says changes
        setFlag("enter4");
    }

    @Override
    public ScriptState execute() {
        start();
        if (!isTextboxQueueEmpty()) {
            return ScriptState.RUNNING;
        }
        end();
        return ScriptState.COMPLETED;
    }
}


    
