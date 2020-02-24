package character.player;

import character.User;

public abstract class PlayerCharacter extends User {

    private double damageMultiplier;

    public PlayerCharacter(String name, double damageMultiplier) {
       super(name);
       this.damageMultiplier = damageMultiplier;
    }

    public double getDamageMultiplier() {
        return damageMultiplier;
    }

}
