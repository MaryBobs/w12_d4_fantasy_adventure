package players;

import enemies.Enemy;
import enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;
import player.Fighter;
import skill.Skill;
import valuables.Valuable;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    private Fighter fighter;
    private Skill sword;
    private Skill hammer;
    private Valuable gold;
    private Enemy orc;

    @Before
    public void before() {
        sword = new Skill("Sword", 3);
        fighter = new Fighter(20, sword);
        hammer = new Skill("Hammer", 5);
        gold = new Valuable("gold", 5);
        orc = new Enemy(10, 3, EnemyType.ORC);
    }

    @Test
    public void canGetHealth() {
        assertEquals(20, fighter.getHealth());
    }

    @Test
    public void canSetHealth() {
        fighter.setHealth(10);
        assertEquals(10, fighter.getHealth());
    }

    @Test
    public void canGetSkill() {
        assertEquals(sword, fighter.getSkill());
    }

    @Test
    public void canSetSkill() {
        fighter.setSkill(hammer);
        assertEquals(hammer, fighter.getSkill());
    }

    @Test
    public void canGetTreasures() {
        assertEquals(0, fighter.getTreasures().size());
    }

    @Test
    public void canCollectTreasure() {
        fighter.collectTreasure(gold);
        assertEquals(1, fighter.getTreasures().size());
    }

    @Test
    public void canDefend() {
        fighter.defend(3);
        assertEquals(17, fighter.getHealth());
    }

    @Test
    public void canActivateSkill() {
        fighter.activateSkill(orc);
        assertEquals(7, orc.getHealth());
    }
}
