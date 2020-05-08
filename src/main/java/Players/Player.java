package Players;

public abstract class Player {

    private String name;
    private int health;
    private int pouch;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.pouch = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPouch() {
        return pouch;
    }

    public void setPouch(int pouch) {
        this.pouch = pouch;
    }
}
