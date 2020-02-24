import character.enemy.Enemy;
import character.enemy.Vampire;
import character.player.Dwarf;
import loot.GoldCoin;
import onHand.Sword;
import onHand.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Weapon sword;
    private GoldCoin goldCoin;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 3);
        sword = new Sword("Akaviri", 15);
        goldCoin = new GoldCoin(100);
    }

    @Test
    public void dwarfHasName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void startsWithFullHealth() {
        assertEquals(200, dwarf.getHP(), 0.01);
    }

    @Test
    public void hasAWeapon() {
        dwarf.addWeapon(sword);
        assertEquals(1, dwarf.getWeaponsList().size());
    }

    @Test
    public void canReduceHealth() {
        dwarf.decreaseHP(10);
        assertEquals(190, dwarf.getHP(), 0.01);
    }

    @Test
    public void canCollectCoins() {
        dwarf.addLoot(goldCoin);
        assertEquals(1, dwarf.getLoostList().size());
    }

}
