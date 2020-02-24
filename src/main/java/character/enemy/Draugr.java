package character.enemy;
import character.*;

public class Draugr extends Enemy{
    public Draugr(String name, double attackMultiplier) {
        super(name, attackMultiplier);
    }

    public void attack(User enemy) {
        enemy.decreaseHP(this.getAttackMultiplier() * 1);
    }

}
