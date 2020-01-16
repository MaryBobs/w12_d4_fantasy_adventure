package player;

import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import skill.Skill;

import static org.junit.Assert.*;

public class MagicianTest {

    private Magician magician1;
    private MythicalCreature dragon;
    private Skill fireball;

    @Before
    public void setUp() {
        fireball = new Skill("fireball", 5);
        dragon = new MythicalCreature("Fred", 2);
        magician1 = new Magician(20, fireball, dragon);
    }

    @Test
    public void getCompanion() {
        assertEquals(dragon, magician1.getCompanion());
    }
}