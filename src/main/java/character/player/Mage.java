package character.player;

import character.User;
import onHand.Staff;

import java.util.ArrayList;

public abstract class Mage extends PlayerCharacter{
    private ArrayList<Staff>staffs;

    public Mage(String name, double damageMultiplier) {
        super(name, damageMultiplier);
        this.staffs = new ArrayList<Staff>();
    }

    public ArrayList<Staff> getStaffList() {
        return this.staffs;
    }

    public void getStaff(Staff staff) {
        this.staffs.add(staff);
    }

    public void useStaff(User enemy) {
        Staff currentStaff = this.getStaffList().get(0);
        enemy.decreaseHP((currentStaff.getDamage() * this.getDamageMultiplier()));
    }

}
