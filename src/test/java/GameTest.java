import enemies.Enemy;
import enemies.EnemyType;
import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import player.Fighter;
import player.Magician;
import player.Player;
import rooms.Room;
import skill.Skill;
import valuables.Valuable;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GameTest {

    private Game game;
    private Room room1;
    private Room room2;
    private Enemy orc;
    private Enemy troll;
    private Fighter fighter1;
    private Fighter fighter2;
    private Fighter fighter3;
    private Fighter fighter4;
    private Skill sword;
    private Valuable gold;
    private ArrayList<Valuable> treasures;
    private ArrayList<Player> players;

    @Before
    public void setUp() {
        orc = new Enemy(10, 3, EnemyType.ORC);
        sword = new Skill("Sword", 3);
        fighter1 = new Fighter(20, sword);
        fighter2 = new Fighter(30, sword);
        fighter3 = new Fighter(15, sword);
        fighter4 = new Fighter(25, sword);
        gold = new Valuable("gold", 5);
        treasures = new ArrayList<Valuable>();
        treasures.add(gold);
        room1 = new Room(orc, treasures);
        players = new ArrayList<Player>(Arrays.asList(fighter1, fighter2, fighter3, fighter4));
        game = new Game();
        troll = new Enemy(50, 10, EnemyType.TROLL);
        room2 = new Room(troll, treasures);
    }

    @Test
    public void canFightEnemy() {
        room1.addPlayers(players);
        game.battleEnemy(room1);
        assertEquals(4, room1.getPlayers().size());
        assertNull(room1.getEnemy());
        assertEquals(1, fighter1.getTreasures().size());
    }

    @Test
    public void canEnemyWin() {
        room2.addPlayers(players);
        game.battleEnemy(room2);
        assertEquals(0, room2.getPlayers().size());
        assertEquals(troll, room2.getEnemy());
        assertEquals(treasures, room2.getTreasures());
    }
}
