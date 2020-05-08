package Enemies;

import Resources.Spell;
import Resources.Staff;

import java.util.ArrayList;

public class Sorcerer extends Enemy{

    private ArrayList<Spell> spells;
    private Staff staff;

    public Sorcerer(String name, int health, Staff staff) {
        super(name, health);
        this.spells = new ArrayList<Spell>();
        this.staff = staff;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
     public void addSpell(Spell spell){
        this.spells.add(spell);
     }
}
