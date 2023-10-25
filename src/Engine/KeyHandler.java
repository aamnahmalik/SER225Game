package Engine;

import java.awt.event.KeyEvent;
import Level.Player;
import java.awt.event.KeyAdapter;

public class KeyHandler extends KeyAdapter {
    private Player player; // You will need to pass the player instance to this class.

    public KeyHandler(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_E) {
            // When the "E" key is pressed, call the attack method in the player.
            player.attack(player.getFacingDirection());
        }
    }
}
