package Weapon.strategies.ReloadStrategy.Concrete;

import Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class StandardReloadStrategy implements IReloadStrategy {
    @Override
    public void reload() {
        System.out.println("Reloading with standard procedure");
    }
}
