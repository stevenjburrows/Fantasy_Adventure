package Players;

import Resources.Spell;
import Resources.Staff;

import java.util.ArrayList;

public class Wizard extends Player {

    private Staff staff;
    private ArrayList<Spell> spells;

    public Wizard(String name, int health, Staff staff) {
        super(name, health);
        this.staff = staff;
        this.spells = new ArrayList<Spell>();
    }

    public Staff getStaff() {
        return staff;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void addSpell(Spell spell){
        this.spells.add(spell);
    }
}
