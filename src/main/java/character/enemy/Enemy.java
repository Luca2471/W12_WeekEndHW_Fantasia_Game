package character.enemy;
import  character.*;

public abstract class Enemy {

    private String name;
    private double attackMultiplier;
    private double HP;

    public Enemy(String name, double attackMultiplier) {
        this.name = name;
        this.attackMultiplier = attackMultiplier;
        this.HP = 100;
    }

    public String getName() {
        return name;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

    public double getHP() {
        return HP;
    }

    public void decreaseHP(double amount) {
        this.HP -= amount;
    }

    public void attack(User enemy){

    }
}
