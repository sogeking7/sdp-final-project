package Strategy.Weapon.strategies.FireStrategy.Concrete;

import Strategy.Weapon.strategies.FireStrategy.IFireStrategy;

public class SingleFireStrategy implements IFireStrategy {
    @Override
    public void fire() {
        System.out.println("Firing a single shot");
    }
}
