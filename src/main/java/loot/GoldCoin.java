package loot;

public class GoldCoin implements ILoot{
    private double value;

    public GoldCoin(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
