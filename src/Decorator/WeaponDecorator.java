package Decorator;

import Strategy.Weapon.Weapon;

public abstract class WeaponDecorator extends Weapon {
    protected Weapon decoratedWeapon;

    public WeaponDecorator(Weapon weapon) {
        super(weapon.getName(), weapon.getFireStrategy(), weapon.getReloadStrategy());
        this.decoratedWeapon = weapon;
    }

    @Override
    public void Fire() {
        this.decoratedWeapon.Fire();
    }

    @Override
    public void Reload() {
        this.decoratedWeapon.Reload();
    }
}
