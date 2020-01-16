package rooms;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.Dwarf;
import skill.Skill;
import valuables.Valuable;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room1;
    private Enemy orc;
    private Dwarf dwarf;
    private Skill sword;
    private Valuable gold;
    private ArrayList<Valuable> treasures;

    @Before
    public void setUp() {
        orc = new Enemy(10, 3, EnemyType.ORC);
        sword = new Skill("Sword", -3);
        dwarf = new Dwarf(20, sword);
        gold = new Valuable("gold", 5);
        treasures = new ArrayList<Valuable>();
        treasures.add(gold);
        room1 = new Room(orc, treasures);
    }

    @Test
    public void getPlayers() {
        assertEquals(0, room1.getPlayers().size());
    }

    @Test
    public void getEnemy() {
        assertEquals(orc, room1.getEnemy());
    }

    @Test
    public void getTreasures() {
        assertEquals(treasures, room1.getTreasures());
    }

    @Test
    public void canTakeTreasures() {
        ArrayList<Valuable> treasuresTaken = room1.takeTreasures();
        assertEquals(0, room1.getTreasures().size());
        assertEquals(treasuresTaken, treasures);
    }
}