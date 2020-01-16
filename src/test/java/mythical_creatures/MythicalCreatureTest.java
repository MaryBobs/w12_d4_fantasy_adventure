package mythical_creatures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MythicalCreatureTest {

    private MythicalCreature dragon;

    @Before
    public void setUp() {
        dragon = new MythicalCreature("Fred", 2);
    }

    @Test
    public void getName() {
        assertEquals("Fred", dragon.getName());
    }

    @Test
    public void getDefenceValue() {
        assertEquals(2, dragon.getDefenceValue());
    }
}