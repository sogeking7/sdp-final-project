package Factory.player;
public abstract class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void useBomb();

    public void takeDamage(int damagePoints) {
        this.health -= damagePoints;
        System.out.println(name + " took " + damagePoints + " damage. Remaining health: " + health);
    }
    public void heal(int healPoints) {
        this.health += healPoints;
        System.out.println(name + " healed for " + healPoints + " points. Remaining health: " + health);
    }
    public void displayInfo() {
        System.out.println("Player: " + name + ", Health: " + health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
