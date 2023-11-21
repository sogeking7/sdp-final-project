package Strategy.Weapon.strategies.ReloadStrategy.Concrete;

import Strategy.Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class StandardReloadStrategy implements IReloadStrategy {
    @Override
    public void reload() {
        System.out.println("Reloading with standard procedure");
    }
}
