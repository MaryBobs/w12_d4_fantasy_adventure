package rooms;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.Dwarf;
import player.Player;
import skill.Skill;
import valuables.Valuable;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room1;
    private Enemy orc;
    private Dwarf dwarf1;
    private Dwarf dwarf2;
    private Skill sword;
    private Valuable gold;
    private ArrayList<Valuable> treasures;
    private ArrayList<Player> players;

    @Before
    public void setUp() {
        orc = new Enemy(10, 3, EnemyType.ORC);
        sword = new Skill("Sword", -3);
        dwarf1 = new Dwarf(20, sword);
        dwarf2 = new Dwarf(30, sword);
        gold = new Valuable("gold", 5);
        treasures = new ArrayList<Valuable>();
        treasures.add(gold);
        room1 = new Room(orc, treasures);
        players = new ArrayList<Player>(Arrays.asList(dwarf1, dwarf2));
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

    @Test
    public void canAddPlayers() {
        room1.addPlayers(players);
        assertEquals(2, room1.getPlayers().size());
    }
}