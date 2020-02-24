package character.player;

import character.User;
import onHand.HealingSpell;

import java.util.ArrayList;

public abstract class Healer extends User {
    private ArrayList<HealingSpell> healingSpells;

    public Healer(String name) {
        super(name);
        this.healingSpells = new ArrayList<HealingSpell>();
    }

    public ArrayList<HealingSpell> getHealingSpells() {
        return healingSpells;
    }

    public void healDwarf(Dwarf dwarf, HealingSpell healingSpell) {
        if (this.healingSpells.contains(healingSpell)) {
            dwarf.increaseHP(healingSpell.getHealingAmount());
            this.healingSpells.remove(healingSpell);
        }
    }

    public void healHighElf(HighElf highElf, HealingSpell healingSpell) {
        if (this.healingSpells.contains(healingSpell)) {
            highElf.increaseHP(healingSpell.getHealingAmount());
            this.healingSpells.remove(healingSpell);
        }
    }

    public void AddHealingSpell(HealingSpell healingSpell) {
        this.healingSpells.add(healingSpell);
    }
}
