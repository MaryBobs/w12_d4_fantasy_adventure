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
    private Enemy orc;
    private Fighter fighter1;
    private Fighter fighter2;
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
        gold = new Valuable("gold", 5);
        treasures = new ArrayList<Valuable>();
        treasures.add(gold);
        room1 = new Room(orc, treasures);
        players = new ArrayList<Player>(Arrays.asList(fighter1, fighter2));
        game = new Game();
    }

    @Test
    public void canFightEnemy() {
        room1.addPlayers(players);
        game.battleEnemy(room1);
        assertEquals(2, room1.getPlayers().size());
        assertNull(room1.getEnemy());
        assertEquals(1, fighter1.getTreasures().size());
    }
}
