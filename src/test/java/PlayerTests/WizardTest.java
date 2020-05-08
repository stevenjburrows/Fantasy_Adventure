package PlayerTests;

import Players.Wizard;
import Resources.Spell;
import Resources.Staff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard merlin;
    private Spell attack;
    private Spell heal;
    private Staff staff;


    @Before
    public void before() {
        staff = new Staff("Sidhe", 30, 10);
        attack = new Spell("attack", 30, 0);
        heal = new Spell("heal", 0, 20);
        merlin = new Wizard("Merlin", 30, staff);
    }

    @Test
    public void addSpell() {
        merlin.addSpell(attack);
        assertEquals(1, merlin.getSpells().size());
    }

    @Test
    public void basicTest() {
        assertEquals("Merlin", merlin.getName());
        assertEquals(30, merlin.getHealth());
        assertEquals("Sidhe", merlin.getStaff().getName());
    }


}
