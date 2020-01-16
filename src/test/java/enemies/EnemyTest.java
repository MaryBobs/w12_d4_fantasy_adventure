package enemies;

import org.junit.Before;
import org.junit.Test;
import player.Fighter;
import skill.Skill;

import static org.junit.Assert.*;

public class EnemyTest {

    private Enemy orc;
    private Fighter fighter;
    private Skill sword;

    @Before
    public void setUp() {
        orc = new Enemy(10, 3, EnemyType.ORC);
        sword = new Skill("Sword", -3);
        fighter = new Fighter(20, sword);
    }

    @Test
    public void getHealth() {
        assertEquals(10, orc.getHealth());
    }

    @Test
    public void getDamage() {
        assertEquals(3, orc.getDamage());
    }

    @Test
    public void getEnemyType() {
        assertEquals(EnemyType.ORC, orc.getEnemyType());
    }

    @Test
    public void setHealth() {
        orc.setHealth(15);
        assertEquals(15, orc.getHealth());
    }

    @Test
    public void canAttack() {
        orc.attack(fighter);
        assertEquals(17, fighter.getHealth());
    }
}