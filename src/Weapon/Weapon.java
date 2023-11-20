package Weapon;

import Weapon.strategies.FireStrategy.IFireStrategy;
import Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class Weapon {
    private String name;
    private IFireStrategy fireStrategy;
    private IReloadStrategy reloadStrategy;

    public Weapon(String name, IFireStrategy fireStrategy, IReloadStrategy reloadStrategy) {
        this.name = name;
        this.fireStrategy = fireStrategy;
        this.reloadStrategy = reloadStrategy;
    }

    public void Fire() {
        this.fireStrategy.fire();
    }

    public void Reload() {
        this.reloadStrategy.reload();
    }

    public void setFireStrategy(IFireStrategy fireStrategy) {
        this.fireStrategy = fireStrategy;
    }

    public void setReloadStrategy(IReloadStrategy reloadStrategy) {
        this.reloadStrategy = reloadStrategy;
    }
}
