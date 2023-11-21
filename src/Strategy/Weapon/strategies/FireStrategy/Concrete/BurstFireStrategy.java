package Strategy.Weapon.strategies.FireStrategy.Concrete;

import Strategy.Weapon.strategies.FireStrategy.IFireStrategy;

public class BurstFireStrategy implements IFireStrategy {
    @Override
    public void fire() {
        System.out.println("Firing in burst mode");
    }
}
