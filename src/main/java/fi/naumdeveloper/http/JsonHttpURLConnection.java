package fi.naumdeveloper.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonHttpURLConnection {

    public static String HttpUrl()  {

        try {
            final URL url = new URL("https://your-demo.site/api/library");
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setConnectTimeout(1000);
            connection.setReadTimeout(1000);

            final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            return in.readLine();

        } catch (IOException e) {
            System.out.println("JsonHttpURLConnection error " + e);
        }

        return null;
    }

}
