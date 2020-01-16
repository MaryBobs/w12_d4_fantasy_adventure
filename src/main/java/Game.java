import player.Player;
import rooms.Room;
import valuables.Valuable;

import java.util.ArrayList;

public class Game {


    public void battleEnemy(Room room) {
        while (room.getPlayers().size() > 0 && room.getEnemy() != null) {
            for (Player player : room.getPlayers()) {
                player.activateSkill(room.getEnemy());
                if (room.getEnemy().getHealth() < 0) {
                    room.killEnemy();
                    break;
                }
                room.getEnemy().attack(player);
            }
        }
        if (room.getPlayers().size() > 0) {
            for (Valuable treasure : room.getTreasures()) {
                room.getPlayers().get(0).collectTreasure(treasure);
            }
        }
    }
}
