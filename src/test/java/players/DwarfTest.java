package players;

import org.junit.Before;
import org.junit.Test;
import player.Dwarf;
import skill.Skill;
import valuables.Valuable;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Skill sword;
    private Skill hammer;
    private Valuable gold;

    @Before
    public void before() {
        sword = new Skill("Sword", -3);
        dwarf = new Dwarf(20, sword);
        hammer = new Skill("Hammer", -5);
        gold = new Valuable("gold", 5);
    }

    @Test
    public void canGetHealth() {
        assertEquals(20, dwarf.getHealth());
    }

    @Test
    public void canSetHealth() {
        dwarf.setHealth(10);
        assertEquals(10, dwarf.getHealth());
    }

    @Test
    public void canGetSkill() {
        assertEquals(sword, dwarf.getSkill());
    }

    @Test
    public void canSetSkill() {
        dwarf.setSkill(hammer);
        assertEquals(hammer, dwarf.getSkill());
    }

    @Test
    public void canGetTreasures() {
        assertEquals(0, dwarf.getTreasures().size());
    }

    @Test
    public void canCollectTreasure() {
        dwarf.collectTreasure(gold);
        assertEquals(1, dwarf.getTreasures().size());
    }

    @Test
    public void canDefend() {
        dwarf.defend(3);
        assertEquals(17, dwarf.getHealth());
    }
}
