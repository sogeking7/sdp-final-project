import Singleton.HttpClientSingleton;

public class Main {
    public static void main(String[] args) {
        HttpClientSingleton httpClient = HttpClientSingleton.getInstance();

        String response = httpClient.get("weapon/pistol");
        System.out.println("Response: " + response);
    }
}