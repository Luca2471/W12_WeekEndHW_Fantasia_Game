package character;

import loot.ILoot;

import java.util.ArrayList;

public abstract class User {
    protected String name;
    protected int hp;
    protected ArrayList<ILoot> lootList;

    public User(String name) {
        this.name = name;
        this.hp = 200;
        this.lootList = new ArrayList<ILoot>();
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public void decreaseHP(double amount) {
        this.hp -= amount;
    }

    public void increaseHP(double amount) {
        this.hp += amount;
    }

    public ArrayList<ILoot> getLoostList() {
        return this.lootList;
    }

    public void addLoot(ILoot lootItem) {
        this.lootList.add(lootItem);
    }
}
