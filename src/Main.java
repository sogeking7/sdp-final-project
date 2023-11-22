import Decorator.ScopeDecorator;
import Decorator.SilencerDecorator;
import Singleton.HttpClientSingleton;
import Strategy.Weapon.Weapon;
import Strategy.Weapon.strategies.FireStrategy.Concrete.SingleFireStrategy;
import Strategy.Weapon.strategies.ReloadStrategy.Concrete.StandardReloadStrategy;

public class Main {
    public static void main(String[] args) {
        HttpClientSingleton httpClient = HttpClientSingleton.getInstance();

        String response = httpClient.get("weapon/pistol");
        System.out.println("Response: " + response);

        Weapon customWeapon = new Weapon("Basic Weapon", new SingleFireStrategy(),  new StandardReloadStrategy());
        customWeapon.Fire();

        Weapon scopedWeapon = new ScopeDecorator(customWeapon);
        scopedWeapon.Fire();

        Weapon silencedScopedWeapon = new SilencerDecorator(scopedWeapon);
        silencedScopedWeapon.Fire();

    }
}