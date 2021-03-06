package player;

import mythical_creatures.MythicalCreature;
import org.junit.Before;
import org.junit.Test;
import skill.Skill;

import static org.junit.Assert.*;

public class MagicianTest {

    private Magician magician1;
    private MythicalCreature dragon;
    private MythicalCreature ogre;
    private Skill fireball;

    @Before
    public void setUp() {
        fireball = new Skill("fireball", 5);
        dragon = new MythicalCreature("Fred", 2);
        ogre = new MythicalCreature("Ted", 3);
        magician1 = new Magician(20, fireball, dragon);
    }

    @Test
    public void canGetCompanion() {
        assertEquals(dragon, magician1.getCompanion());
    }

    @Test
    public void canSetCompanion() {
        magician1.setCompanion(ogre);
        assertEquals(ogre, magician1.getCompanion());
    }

    @Test
    public void canDefendWithCompanion() {
        magician1.defend(5);
        assertEquals(17, magician1.getHealth());
    }

}