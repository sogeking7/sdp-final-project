package GunShop.Pistol;

import Weapon.Weapon;
import Weapon.strategies.FireStrategy.Concrete.SingleFireStrategy;
import Weapon.strategies.ReloadStrategy.Concrete.StandardReloadStrategy;

public class Pistol extends Weapon {
    public Pistol () {
        super("Pistol", new SingleFireStrategy(), new StandardReloadStrategy());
    }
}
