package player;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import skill.Skill;
import valuables.Valuable;

import static org.junit.Assert.*;

public class HealerTest {

    private Healer cleric;
    private Fighter fighter;
    private Skill sword;
    private Skill potion;


    @Before
    public void setUp() {
        sword = new Skill("Sword", 3);
        fighter = new Fighter(20, sword);
        potion = new Skill("Potion", 2);
        cleric = new Healer(15, potion);
    }

    @Test
    public void canHeal() {
        cleric.activateSkill(fighter);
        assertEquals(22, fighter.getHealth());
    }

}