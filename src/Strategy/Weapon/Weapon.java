package Strategy.Weapon;

import Strategy.Weapon.strategies.FireStrategy.IFireStrategy;
import Strategy.Weapon.strategies.ReloadStrategy.IReloadStrategy;

public class Weapon {
    private String name;
    private String ammo;
    private Number ReloadTime;
    private Number ShellCount;

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

    public Number getReloadTime() {
        return ReloadTime;
    }

    public Number getShellCount() {
        return ShellCount;
    }

    public String getAmmo() {
        return ammo;
    }

    public String getName() {
        return name;
    }

    public IFireStrategy getFireStrategy() {
        return fireStrategy;
    }

    public IReloadStrategy getReloadStrategy() {
        return reloadStrategy;
    }
}
