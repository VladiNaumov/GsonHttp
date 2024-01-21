package fi.naumdeveloper.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonHttpClient {

    private static final String HTTP_URL ="https://your-demo.site/api/library";

    public static String getHttpClient() {

        // Create an instance of HttpClient
        // Define the URI for the GET request
        URI uri = URI.create(HTTP_URL);

        // Create an instance of HttpRequest with the GET method
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                // .connectTimeout(Duration.ofSeconds(20))
                // .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
                // .authenticator(Authenticator.getDefault())
                .build();

        try {
            // Send the request and receive the response
            HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
              return httpResponse.body();
            // System.out.println("Status Code: " + httpResponse.statusCode());
           // System.out.println("Response Body: " + httpResponse.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
            return null;
    }
}