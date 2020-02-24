package character.player;
import character.User;
import onHand.Weapon;

import java.util.ArrayList;

public abstract class Warrior extends character.player.PlayerCharacter {
    private ArrayList<Weapon> weapons;

    public Warrior(String name, double damageMultiplier) {
        super(name, damageMultiplier);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon>getWeaponsList () {
        return this.weapons;
    }

    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void attack(User enemy) {
        Weapon weaponOnHand = this.weapons.get(0);
        if (enemy.getHP() > 1) {
            enemy.decreaseHP(
                    (weaponOnHand.getDamage()*this.getDamageMultiplier())
            );
        }
    }

}
