package Strategy.GunShop.Rifle;

import Strategy.Weapon.Weapon;
import Strategy.Weapon.strategies.FireStrategy.Concrete.SingleFireStrategy;
import Strategy.Weapon.strategies.ReloadStrategy.Concrete.QuickReloadStrategy;

public class Rifle extends Weapon {
    public Rifle() {
        super("Rifle", new SingleFireStrategy(), new QuickReloadStrategy());
    }
}
