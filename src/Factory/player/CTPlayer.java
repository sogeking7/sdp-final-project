package Factory.player;

public class CTPlayer extends Player {
    public CTPlayer(String name, int health) {
        super(name, health);
    }

    @Override
    public void update() {
        System.out.println(super.getName() + " is notified of an event.");
    }

    @Override
    public void displayWin() {
        System.out.println("Counter Terrorists win!");
    }

    @Override
    public void displayLose() {
        System.out.println("Terrorists win!");
    }

    @Override
    public void useBomb() {
        System.out.println("CT player " + this.getName() + " is defusing the bomb.");
    }
}
