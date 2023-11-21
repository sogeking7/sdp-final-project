package Singleton;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class HttpClientSingleton {
    private static HttpClientSingleton instance;
    private String baseURL = "http://localhost:3000/api/";
    private String token = "";

    private HttpClientSingleton () {}

    public static HttpClientSingleton getInstance() {
        if (instance == null) {
            instance = new HttpClientSingleton();
        }
        return instance;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String get(String endpoint) {
        HttpClient httpClient = HttpClient.newHttpClient();

        String url = baseURL + endpoint;

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + token)
                .build();

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error making GET request: " + e.getMessage();
        }
    }

}
