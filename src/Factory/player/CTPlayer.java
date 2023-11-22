package Factory.player;

public class CTPlayer extends Player {
    public CTPlayer(String name, int health) {
        super(name, health);
    }

    @Override
    public void useBomb() {
        System.out.println("CT player " + this.getName() + " is defusing the bomb.");
    }
}
