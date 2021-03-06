package rooms;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.Fighter;
import player.Player;
import skill.Skill;
import valuables.Valuable;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RoomTest {

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
        sword = new Skill("Sword", -3);
        fighter1 = new Fighter(20, sword);
        fighter2 = new Fighter(30, sword);
        gold = new Valuable("gold", 5);
        treasures = new ArrayList<Valuable>();
        treasures.add(gold);
        room1 = new Room(orc, treasures);
        players = new ArrayList<Player>(Arrays.asList(fighter1, fighter2));
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

    @Test
    public void canKillEnemy() {
        room1.killEnemy();
        assertNull(room1.getEnemy());
    }

    @Test
    public void canKillPlayer() {
        room1.addPlayers(players);
        room1.killPlayer(fighter2);
        assertEquals(1, room1.getPlayers().size());
    }

    @Test
    public void canGetPlayersTotalHealth() {
        room1.addPlayers(players);
        assertEquals(50, room1.getTotalPlayerHealth());
    }

    @Test
    public void canRemoveAllPlayers() {
        room1.addPlayers(players);
        room1.removeAllPlayers();
        assertEquals(0, room1.getPlayers().size());
    }
}