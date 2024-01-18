package fi.naumdeveloper.parser;

import com.google.gson.Gson;
import fi.naumdeveloper.http.MyHttpClient;
import fi.naumdeveloper.model.Library;
import fi.naumdeveloper.model.Root;

import java.io.FileNotFoundException;
import java.io.FileReader;;

public class GsonParser {

     private static Gson gson = new Gson();

    public static void parserFile() {
        try {
            FileReader reader = new FileReader("library.json");
            Root root = gson.fromJson(reader, Root.class);
            // System.out.println(root);
            for (Library library : root.getLibrary()) {
                System.out.println(library);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Parser error " + e.toString());
        }
    }

    public static void parserHttp() {
        String str = MyHttpClient.HttpClient();
        Root root = gson.fromJson(str, Root.class);
        //System.out.println(str.toString());
        for (Library library : root.getLibrary()) {
            System.out.println(library);
        }
    }
}
