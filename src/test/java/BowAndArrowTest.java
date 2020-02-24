import onHand.BowAndArrow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowAndArrowTest {

    BowAndArrow bowAndArrow;

    @Before
    public void before() {
        bowAndArrow = new BowAndArrow("Nightingale Bow", 30);
    }

    @Test
    public void hadName() {
        assertEquals("Nightingale Bow", bowAndArrow.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(30, bowAndArrow.getDamage(), 0.01);
    }
}
