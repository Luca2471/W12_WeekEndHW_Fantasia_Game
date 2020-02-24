import loot.GoldCoin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoldCoinTest {

    private GoldCoin goldCoin;

    @Before
    public void before() {
        goldCoin = new GoldCoin(100);
    }

    @Test
    public void canGetAmount() {
        assertEquals(100, goldCoin.getValue(), 0.01);
    }

}
