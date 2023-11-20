package GunShop.Rifle;

import Weapon.Weapon;
import Weapon.strategies.FireStrategy.Concrete.SingleFireStrategy;
import Weapon.strategies.ReloadStrategy.Concrete.QuickReloadStrategy;

public class Rifle extends Weapon {
    public Rifle() {
        super("Rifle", new SingleFireStrategy(), new QuickReloadStrategy());
    }
}
