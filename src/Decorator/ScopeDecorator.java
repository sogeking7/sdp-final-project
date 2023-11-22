package Decorator;

import Strategy.Weapon.Weapon;

public class ScopeDecorator extends WeaponDecorator {
    public ScopeDecorator(Weapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public void Fire() {
        super.Fire();
        System.out.println("Adding scope to " + this.getName());
    }

    @Override
    public void Reload() {
        super.Reload();
        System.out.println("Adding scope to " + this.getName());
    }
}
