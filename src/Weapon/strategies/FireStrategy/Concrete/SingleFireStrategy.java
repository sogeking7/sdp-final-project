package Weapon.strategies.FireStrategy.Concrete;

import Weapon.strategies.FireStrategy.IFireStrategy;

public class SingleFireStrategy implements IFireStrategy {
    @Override
    public void fire() {
        System.out.println("Firing a single shot");
    }
}
