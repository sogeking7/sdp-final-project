package Strategy.Weapon.strategies.ReloadStrategy.Concrete;

import Strategy.Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class LongReloadStrategy implements IReloadStrategy {
    @Override
    public void reload() {
        System.out.println("Long reload");
    }
}
