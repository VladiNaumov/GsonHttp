package fi.naumdeveloper.parser;

import com.google.gson.Gson;
import fi.naumdeveloper.http.JsonHttpClient;
import fi.naumdeveloper.model.Book;
import fi.naumdeveloper.model.Root;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonParser {

     private static final Gson gson = new Gson();

    public static void getParserFile() {
        try {
            FileReader reader = new FileReader("library.json");
            Root root = gson.fromJson(reader, Root.class);
            // System.out.println(root);
            for (Book book : root.getLibrary()) {
                System.out.println(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Parser error " + e);
        }
    }

    public static void getParserHttp() {
        String str = JsonHttpClient.getHttpClient();
        Root root = gson.fromJson(str, Root.class);
        //System.out.println(root);
        for (Book book : root.getLibrary()) {
            System.out.println(book);
        }
    }
}
