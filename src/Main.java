import Decorator.ScopeDecorator;
import Decorator.SilencerDecorator;
import Factory.player.CTPlayer;
import Factory.player.Player;
import Factory.player.TPlayer;
import Observer.GameEventSubject;
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

        Player player = new CTPlayer("Player", 100);
        Player enemy = new TPlayer("Enemy", 100);

        GameEventSubject gameEventSubject = new GameEventSubject();

        gameEventSubject.addObserver(player);
        gameEventSubject.addObserver(enemy);

        gameEventSubject.notifyObservers();
    }
}