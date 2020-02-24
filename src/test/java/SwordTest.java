import onHand.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;

    @Before
    public void before() {
        sword = new Sword("Dawnbreaker", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Dawnbreaker", sword.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(20, sword.getDamage(), 0.01);
    }
}
