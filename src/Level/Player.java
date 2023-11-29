package Level;

import Engine.Key;
import Engine.KeyLocker;
import Engine.Keyboard;
import GameObject.GameObject;
import GameObject.Rectangle;
import GameObject.SpriteSheet;
import Utils.Direction;
import EnhancedMapTiles.Weapon;
import java.util.ArrayList;

public abstract class Player extends GameObject {
    // values that affect player movement
    // these should be set in a subclass
    protected float walkSpeed = 0;
    protected float runSpeed = 4;
    protected int interactionRange = 5;
    protected Direction currentWalkingXDirection;
    protected Direction currentWalkingYDirection;
    protected Direction lastWalkingXDirection;
    protected Direction lastWalkingYDirection;
    protected boolean isAttacking = false;
    protected boolean walking = false;

    // values used to handle player movement
    protected float moveAmountX, moveAmountY;
    protected float lastAmountMovedX, lastAmountMovedY;

    // values used to keep track of player's current state
    protected PlayerState playerState;
    protected PlayerState previousPlayerState;
    protected Direction facingDirection;
    protected Direction lastMovementDirection;

    // classes that listen to player events can be added to this list
    protected ArrayList<PlayerListener> listeners = new ArrayList<>();

    // define keys
    protected KeyLocker keyLocker = new KeyLocker();
    protected Key MOVE_LEFT_KEY = Key.LEFT;
    protected Key MOVE_RIGHT_KEY = Key.RIGHT;
    protected Key MOVE_UP_KEY = Key.UP;
    protected Key MOVE_DOWN_KEY = Key.DOWN;
    protected Key INTERACT_KEY = Key.SPACE;
    protected Key RUN_LEFT_KEY = Key.A;
    protected Key RUN_RIGHT_KEY = Key.D;
    protected Key RUN_UP_KEY = Key.W; 
    protected Key RUN_DOWN_KEY = Key.S; 
    protected Key ATTACK = Key.E;


    public Player(SpriteSheet spriteSheet, float x, float y, String startingAnimationName) {
        super(spriteSheet, x, y, startingAnimationName);
        facingDirection = Direction.RIGHT;
        playerState = PlayerState.STANDING;
        previousPlayerState = playerState;
        this.affectedByTriggers = true;
    }

    public void update() {
        moveAmountX = 0;
        moveAmountY = 0;

        // if player is currently playing through level (has not won or lost)
        // update player's state and current actions, which includes things like determining how much it should move each frame and if its walking or jumping
        do {
            previousPlayerState = playerState;
            handlePlayerState();
        } while (previousPlayerState != playerState);

        // move player with respect to map collisions based on how much player needs to move this frame
        if (playerState != PlayerState.INTERACTING) {
            lastAmountMovedY = super.moveYHandleCollision(moveAmountY);
            lastAmountMovedX = super.moveXHandleCollision(moveAmountX);
        }

        handlePlayerAnimation();

        updateLockedKeys();

        // update player's animation
        super.update();
    }

    // based on player's current state, call appropriate player state handling method
    protected void handlePlayerState() {
        switch (playerState) {
            case STANDING:
                playerStanding();
                break;
            case WALKING:
                playerWalking();
                break;
            case INTERACTING:
                playerInteracting();
                break;
            case RUNNING: 
                playerRunning();
                break; 
            case ATTACKING:
                playerAttacking();
                break;           
        }
    }

    // player STANDING state logic
    protected void playerStanding() {
        if (!keyLocker.isKeyLocked(INTERACT_KEY) && Keyboard.isKeyDown(INTERACT_KEY)) {
            keyLocker.lockKey(INTERACT_KEY);
            map.entityInteract(this);
        }

        // if a walk key is pressed, player enters WALKING state
        if (Keyboard.isKeyDown(MOVE_LEFT_KEY) || Keyboard.isKeyDown(MOVE_RIGHT_KEY) || Keyboard.isKeyDown(MOVE_UP_KEY) || Keyboard.isKeyDown(MOVE_DOWN_KEY)) {
            playerState = PlayerState.WALKING;
        }

        // uf a run key is pressed, player enters RUNNING state 
        if (Keyboard.isKeyDown(RUN_LEFT_KEY) || Keyboard.isKeyDown(RUN_RIGHT_KEY) || Keyboard.isKeyDown(RUN_UP_KEY) || Keyboard.isKeyDown(RUN_DOWN_KEY)) { 
            playerState = PlayerState.RUNNING;
        }

        if (Keyboard.isKeyDown(ATTACK)) { 
            playerState = PlayerState.ATTACKING;
        }
        }

    // player ATTACKING state logic
    protected void playerAttacking() {
        
        if (!keyLocker.isKeyLocked(INTERACT_KEY) && Keyboard.isKeyDown(INTERACT_KEY)) {
        keyLocker.lockKey(INTERACT_KEY);
        map.entityInteract(this);            
        }

        if (Weapon.hasTheWeapon()) {
            if (Keyboard.isKeyDown(ATTACK)) {
                if (!isAttacking) {
                    // Start the attacking animation
                    playerState = PlayerState.ATTACKING;
                    isAttacking = true;    
                }
            }
          else {
                // The "E" key is released, reset the flag to allow for attacking again
                isAttacking = false;
    
                // Transition to another state when the attack animation is complete, if needed.
                // For example, you can transition to STANDING state here.
                if (isAttackAnimationComplete()) {
                    playerState = PlayerState.STANDING;
                }
            }
        } 
        else {
            // Player doesn't have the weapon, set the player state to STANDING
            playerState = PlayerState.STANDING;
        }
    }

    public boolean isAttacking()
    {
        return this.isAttacking;
    }
    

    private boolean isAttackAnimationComplete() {
        // Check if the current frame index for the attack animation has reached the last frame
        int totalFrames = animations.get("ATTACK_RIGHT").length; // Adjust based on your animation naming
        return getCurrentFrameIndex() == totalFrames - 1;
    }
    
    
    // player WALKING state logic
    protected void playerWalking() {
        if (!keyLocker.isKeyLocked(INTERACT_KEY) && Keyboard.isKeyDown(INTERACT_KEY)) {
            keyLocker.lockKey(INTERACT_KEY);
            map.entityInteract(this);
        }

        // if walk left key is pressed, move player to the left
        if (Keyboard.isKeyDown(MOVE_LEFT_KEY)) {
            moveAmountX -= walkSpeed;
            facingDirection = Direction.LEFT;
            currentWalkingXDirection = Direction.LEFT;
            lastWalkingXDirection = Direction.LEFT;
        }

        // if walk right key is pressed, move player to the right
        else if (Keyboard.isKeyDown(MOVE_RIGHT_KEY)) {
            moveAmountX += walkSpeed;
            facingDirection = Direction.RIGHT;
            currentWalkingXDirection = Direction.RIGHT;
            lastWalkingXDirection = Direction.RIGHT;
        }

        if (Keyboard.isKeyDown(MOVE_UP_KEY)) {
            moveAmountY -= walkSpeed;
            facingDirection = Direction.UP;
            currentWalkingYDirection = Direction.UP;
            lastWalkingYDirection = Direction.UP;
        }
        else if (Keyboard.isKeyDown(MOVE_DOWN_KEY)) {
            moveAmountY += walkSpeed;
            facingDirection = Direction.DOWN;
            currentWalkingYDirection = Direction.DOWN;
            lastWalkingYDirection = Direction.DOWN;
        }
        else {
            currentWalkingYDirection = Direction.NONE;
        }

        if ((currentWalkingXDirection == Direction.RIGHT || currentWalkingXDirection == Direction.LEFT) && currentWalkingYDirection == Direction.NONE) {
            lastWalkingYDirection = Direction.NONE;
        }

        if ((currentWalkingYDirection == Direction.UP || currentWalkingYDirection == Direction.DOWN) && currentWalkingXDirection == Direction.NONE) {
            lastWalkingXDirection = Direction.NONE;
        }

        if (Keyboard.isKeyUp(MOVE_LEFT_KEY) && Keyboard.isKeyUp(MOVE_RIGHT_KEY) && Keyboard.isKeyUp(MOVE_UP_KEY) && Keyboard.isKeyUp(MOVE_DOWN_KEY)) {
            playerState = PlayerState.STANDING;
        }
    }

    //player RUNNING staet logic 
    protected void playerRunning() {
        if (!keyLocker.isKeyLocked(INTERACT_KEY) && Keyboard.isKeyDown(INTERACT_KEY)) {
            keyLocker.lockKey(INTERACT_KEY);
            map.entityInteract(this);
        }

        // if run left key is pressed, run player to the left
        if (Keyboard.isKeyDown(RUN_LEFT_KEY)) {
            moveAmountX -= runSpeed;
            facingDirection = Direction.LEFT;
            currentWalkingXDirection = Direction.LEFT;
            lastWalkingXDirection = Direction.LEFT;
        }

        // if run right key is pressed, run player to the right
        else if (Keyboard.isKeyDown(RUN_RIGHT_KEY)) {
            moveAmountX += runSpeed;
            facingDirection = Direction.RIGHT;
            currentWalkingXDirection = Direction.RIGHT;
            lastWalkingXDirection = Direction.RIGHT;
        }
        else {
            currentWalkingXDirection = Direction.NONE;
        }

        if (Keyboard.isKeyDown(RUN_UP_KEY)) {
            moveAmountY -= runSpeed;
            facingDirection = Direction.UP;
            currentWalkingYDirection = Direction.UP;
            lastWalkingYDirection = Direction.UP;
        }
        else if (Keyboard.isKeyDown(RUN_DOWN_KEY)) {
            moveAmountY += runSpeed;
            facingDirection = Direction.DOWN;
            currentWalkingYDirection = Direction.DOWN;
            lastWalkingYDirection = Direction.DOWN;
        }
        else {
            currentWalkingYDirection = Direction.NONE;
        }

        if ((currentWalkingXDirection == Direction.RIGHT || currentWalkingXDirection == Direction.LEFT) && currentWalkingYDirection == Direction.NONE) {
            lastWalkingYDirection = Direction.NONE;
        }

        if ((currentWalkingYDirection == Direction.UP || currentWalkingYDirection == Direction.DOWN) && currentWalkingXDirection == Direction.NONE) {
            lastWalkingXDirection = Direction.NONE;
        }

        if (Keyboard.isKeyUp(RUN_LEFT_KEY) && Keyboard.isKeyUp(RUN_RIGHT_KEY) && Keyboard.isKeyUp(RUN_UP_KEY) && Keyboard.isKeyUp(RUN_DOWN_KEY)) {
            playerState = PlayerState.STANDING;
        }
    }

    // player INTERACTING state logic -- intentionally does nothing so player is locked in place while a script is running
    protected void playerInteracting() { }

    protected void updateLockedKeys() {
        if (Keyboard.isKeyUp(INTERACT_KEY) && playerState != PlayerState.INTERACTING) {
            keyLocker.unlockKey(INTERACT_KEY);
        }
    }

    // anything extra the player should do based on interactions can be handled here
    protected void handlePlayerAnimation() {
        if (playerState == PlayerState.STANDING) {
            if (Weapon.hasTheWeapon() == false)
            {
                // sets animation to a STAND animation based on which way player is facing
                this.currentAnimationName = facingDirection == Direction.RIGHT ? "STAND_RIGHT" : "STAND_LEFT";
            }
            else{
                this.currentAnimationName = facingDirection == Direction.RIGHT ? "STAND_AXL" : "STAND_AXL";
            }
        }
        else if (playerState == PlayerState.WALKING) {
            if (facingDirection == Direction.RIGHT) {
                this.currentAnimationName = "WALK_RIGHT";
            } 
            else if (facingDirection == Direction.LEFT)
            {
                this.currentAnimationName = "WALK_LEFT";
            }
            else if (facingDirection == Direction.UP)
            {
                this.currentAnimationName = "WALK_UP";
            }
            else 
            {
                this.currentAnimationName = "WALK_DOWN";
            }
        }
        else if (playerState == PlayerState.INTERACTING) {
            // sets animation to STAND when player is interacting
            // player can be told to stand or walk during Script by using the "stand" and "walk" methods
            if (Weapon.hasTheWeapon() == false)
            {
                // sets animation to a STAND animation based on which way player is facing
                this.currentAnimationName = facingDirection == Direction.RIGHT ? "STAND_RIGHT" : "STAND_LEFT";
            }
            else{
                this.currentAnimationName = facingDirection == Direction.RIGHT ? "STAND_AXL" : "STAND_AXL";
            }
        }
        else if (playerState == PlayerState.RUNNING) { 
            if (facingDirection == Direction.RIGHT) {
                this.currentAnimationName = "RUN_RIGHT";
            } 
            else if (facingDirection == Direction.LEFT)
            {
                this.currentAnimationName = "RUN_LEFT";
            }
            else if (facingDirection == Direction.UP)
            {
                this.currentAnimationName = "RUN_UP";
            }
            else 
            {
                this.currentAnimationName = "RUN_DOWN";
            }
        }
        else if (playerState == PlayerState.ATTACKING) { 
            
            if (facingDirection == Direction.RIGHT) {
                this.currentAnimationName = "ATTACK_RIGHT";
            } 
            else if (facingDirection == Direction.LEFT)
            {
                this.currentAnimationName = "ATTACK_LEFT";
            }
            else if (facingDirection == Direction.UP)
            {
                this.currentAnimationName = "ATTACK_BACK";
            }
            else 
            {
                this.currentAnimationName = "ATTACK_FRONT";
            }
        }
    }

    @Override
    public void onEndCollisionCheckX(boolean hasCollided, Direction direction, MapEntity entityCollidedWith) { }

    @Override
    public void onEndCollisionCheckY(boolean hasCollided, Direction direction, MapEntity entityCollidedWith) { }

    // other entities can call this method to hurt the player
    public void hurtPlayer(MapEntity mapEntity) {

    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }

    public void setFacingDirection(Direction facingDirection) {
        this.facingDirection = facingDirection;
    }

    public void addListener(PlayerListener listener) {
        listeners.add(listener);
    }

    public Rectangle getInteractionRange() {
        return new Rectangle(
                getBounds().getX1() - interactionRange,
                getBounds().getY1() - interactionRange,
                getBounds().getWidth() + (interactionRange * 2),
                getBounds().getHeight() + (interactionRange * 2));
    }

    public Key getInteractKey() { return INTERACT_KEY; }
    public Direction getCurrentWalkingXDirection() { return currentWalkingXDirection; }
    public Direction getCurrentWalkingYDirection() { return currentWalkingYDirection; }
    public Direction getLastWalkingXDirection() { return lastWalkingXDirection; }
    public Direction getLastWalkingYDirection() { return lastWalkingYDirection; }

    public void stand(Direction direction) {
        facingDirection = direction;
        if (direction == Direction.RIGHT) {
            this.currentAnimationName = "STAND_RIGHT";
        }
        else if (direction == Direction.LEFT) {
            this.currentAnimationName = "STAND_LEFT";
        }
    }

    public void walk(Direction direction, float speed) {
        facingDirection = direction;
        if (direction == Direction.RIGHT) {
            this.currentAnimationName = "WALK_RIGHT";
        }
        else if (direction == Direction.LEFT) {
            this.currentAnimationName = "WALK_LEFT";
        }
        else if (direction == Direction.UP) {
            this.currentAnimationName = "WALK_UP";
        }
        else if (direction == Direction.DOWN) {
            this.currentAnimationName = "WALK_DOWN";
        }
        else {
            if (this.currentAnimationName.contains("RIGHT")) {
                this.currentAnimationName = "WALK_RIGHT";
            }
            else if (this.currentAnimationName.contains("LEFT")){
                this.currentAnimationName = "WALK_LEFT";
            }
            else if (this.currentAnimationName.contains("UP")){
                this.currentAnimationName = "WALK_UP";
            }
            else if (this.currentAnimationName.contains("DOWN")){
                this.currentAnimationName = "WALK_DOWN";
            }
        }
        if (direction == Direction.UP) {
            moveY(-speed);
        }
        else if (direction == Direction.DOWN) {
            moveY(speed);
        }
        else if (direction == Direction.LEFT) {
            moveX(-speed);
        }
        else if (direction == Direction.RIGHT) {
            moveX(speed);
        }
    }

    public void run(Direction direction, float speed) { 
        facingDirection = direction;
        if (direction == Direction.RIGHT) {
            this.currentAnimationName = "RUN_RIGHT";
        }
        else if (direction == Direction.LEFT) {
            this.currentAnimationName = "RUN_LEFT";
        }
        else if (direction == Direction.UP) {
            this.currentAnimationName = "RUN_UP";
        }
        else if (direction == Direction.DOWN) {
            this.currentAnimationName = "RUN_DOWN";
        }
        else {
            if (this.currentAnimationName.contains("RIGHT")) {
                this.currentAnimationName = "RUN_RIGHT";
            }
            else if (this.currentAnimationName.contains("LEFT")){
                this.currentAnimationName = "RUN_LEFT";
            }
            else if (this.currentAnimationName.contains("UP")){
                this.currentAnimationName = "RUN_UP";
            }
            else if (this.currentAnimationName.contains("DOWN")){
                this.currentAnimationName = "RUN_DOWN";
            }
        }
        if (direction == Direction.UP) {
            moveY(-speed);
        }
        else if (direction == Direction.DOWN) {
            moveY(speed);
        }
        else if (direction == Direction.LEFT) {
            moveX(-speed);
        }
        else if (direction == Direction.RIGHT) {
            moveX(speed);
        }
    }

    public void attack(Direction direction) {
        facingDirection = direction;
        if (direction == Direction.RIGHT) {
            this.currentAnimationName = "ATTACK_RIGHT";
        }
        else if (direction == Direction.LEFT) {
            this.currentAnimationName = "ATTACK_LEFT";
        }
        else if (direction == Direction.UP) {
            this.currentAnimationName = "ATTACK_FRONT";
        }
        else if (direction == Direction.DOWN) {
            this.currentAnimationName = "ATTACK_BACK";
        }
        else {
            if (this.currentAnimationName.contains("RIGHT")) {
                this.currentAnimationName = "ATTACK_RIGHT";
            }
            else if (this.currentAnimationName.contains("LEFT")){
                this.currentAnimationName = "ATTACK_LEFT";
            }
            else if (this.currentAnimationName.contains("FRONT")){
                this.currentAnimationName = "ATTACK_FRONT";
            }
            else if (this.currentAnimationName.contains("BACK")){
                this.currentAnimationName = "ATTACK_BACK";
            }
        }
    }
}
