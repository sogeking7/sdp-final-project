package Strategy.GunShop.Pistol;

import Strategy.Weapon.Weapon;
import Strategy.Weapon.strategies.FireStrategy.Concrete.SingleFireStrategy;
import Strategy.Weapon.strategies.ReloadStrategy.Concrete.StandardReloadStrategy;

public class Pistol extends Weapon {
    public Pistol () {
        super("Pistol", new SingleFireStrategy(), new StandardReloadStrategy());
    }
}
