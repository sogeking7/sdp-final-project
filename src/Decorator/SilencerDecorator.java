package Decorator;

import Strategy.Weapon.Weapon;

public class SilencerDecorator extends WeaponDecorator {
    public SilencerDecorator(Weapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public void Fire() {
        super.Fire();
        System.out.println("Adding silencer to " + this.getName());
    }

    @Override
    public void Reload() {
        super.Reload();
        System.out.println("Adding silencer to " + this.getName());
    }
}
