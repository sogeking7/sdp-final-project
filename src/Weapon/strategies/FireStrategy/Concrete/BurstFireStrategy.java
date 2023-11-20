package Weapon.strategies.FireStrategy.Concrete;

import Weapon.strategies.FireStrategy.IFireStrategy;

public class BurstFireStrategy implements IFireStrategy {
    @Override
    public void fire() {
        System.out.println("Firing in burst mode");
    }
}
