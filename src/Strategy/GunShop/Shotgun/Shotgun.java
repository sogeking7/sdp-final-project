package Strategy.GunShop.Shotgun;

import Strategy.Weapon.Weapon;
import Strategy.Weapon.strategies.FireStrategy.Concrete.BurstFireStrategy;
import Strategy.Weapon.strategies.ReloadStrategy.Concrete.LongReloadStrategy;

public class Shotgun extends Weapon {
    public Shotgun() {
        super("Shotgun", new BurstFireStrategy(), new LongReloadStrategy());
    }
}
