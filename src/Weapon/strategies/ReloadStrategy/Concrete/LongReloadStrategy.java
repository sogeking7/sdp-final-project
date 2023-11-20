package Weapon.strategies.ReloadStrategy.Concrete;

import Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class LongReloadStrategy implements IReloadStrategy {
    @Override
    public void reload() {
        System.out.println("Long reload");
    }
}
