package Resources;

public class Spell {
    private String name;
    private int attackPoints;
    private int healPoints;

    public Spell(String name, int attackPoints, int healPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.healPoints = healPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }
}
