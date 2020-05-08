package Players;

import Resources.Armour;
import Resources.Spell;
import Resources.Weapon;

import java.util.ArrayList;

public class Elf extends Player {

    private ArrayList<Spell> spells;
    private Armour armour;
    private Weapon weapon;

    public Elf(String name, int health, Armour armour, Weapon weapon) {
        super(name, health);
        this.armour = armour;
        this.weapon = weapon;
        this.spells = new ArrayList<Spell>();
    }

    public Armour getArmour() {
        return armour;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
