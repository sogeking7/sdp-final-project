package GunShop.Shotgun;

import Weapon.Weapon;
import Weapon.strategies.FireStrategy.Concrete.BurstFireStrategy;
import Weapon.strategies.ReloadStrategy.Concrete.LongReloadStrategy;

public class Shotgun extends Weapon {
    public Shotgun() {
        super("Shotgun", new BurstFireStrategy(), new LongReloadStrategy());
    }
}
