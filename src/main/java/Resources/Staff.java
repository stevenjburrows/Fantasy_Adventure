package Resources;

public class Staff {

    private String name;
    private int attackPoints;
    private int healPoints;

    public Staff(String name, int attackPoints, int healPoints) {
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
