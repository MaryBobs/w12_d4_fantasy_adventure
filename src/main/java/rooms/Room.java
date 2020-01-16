package rooms;

import enemies.Enemy;
import player.Player;
import valuables.Valuable;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private Enemy enemy;
    private ArrayList<Valuable> treasures;

    public Room(Enemy enemy, ArrayList<Valuable> treasures) {
        this.enemy = enemy;
        this.treasures = treasures;
        this.players = new ArrayList<Player>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public ArrayList<Valuable> getTreasures() {
        return treasures;
    }

    public ArrayList<Valuable> takeTreasures() {
        ArrayList<Valuable> takenTreasures = treasures;
        treasures = new ArrayList<Valuable>();
        return takenTreasures;
    }

    public void addPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void killEnemy() {
        this.enemy = null;
    }

    public void killPlayer(Player player) {
        players.remove(player);
    }
}
