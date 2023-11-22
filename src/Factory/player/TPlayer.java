package Factory.player;

public class TPlayer extends Player {
    public TPlayer(String name, int health) {
        super(name, health);
    }

    @Override
    public void useBomb() {
        System.out.println("T player " + this.getName() + " is planting the bomb.");
    }
}
