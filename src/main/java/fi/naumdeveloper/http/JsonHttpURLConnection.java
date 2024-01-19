package fi.naumdeveloper.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonHttpURLConnection {

    public static void HttpUrl() throws IOException {

        final URL url = new URL("https://your-demo.site/api/library");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(1000);
        connection.setReadTimeout(1000);


        try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            //System.out.println("in.readLine(): " + in.readLine());

            String inputLine;
            final StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            System.out.println(content);

        } catch (final Exception ex) {
            ex.printStackTrace();

        }


    }

}
