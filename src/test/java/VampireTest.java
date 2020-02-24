import character.User;
import character.enemy.Vampire;
import character.player.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VampireTest {

    private Vampire vampire;
    private User dwarf;

    @Before
    public void before() {
        vampire = new Vampire("Nosferatus", 2);
        dwarf = new Dwarf("Gimli", 3);
    }

    @Test
    public void canDecreaseHealth() {
        vampire.decreaseHP(10);
        assertEquals(90, vampire.getHP(), 0.01);
    }
}
