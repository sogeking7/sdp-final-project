package Weapon.strategies.ReloadStrategy.Concrete;

import Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class QuickReloadStrategy implements IReloadStrategy {
    @Override
    public void reload() {
        System.out.println("Quick reload");
    }
}
