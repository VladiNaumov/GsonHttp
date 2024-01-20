package fi.naumdeveloper.model;

import java.util.List;

public class Root {


    private List<Book> library;

    public List<Book> getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "Root{" +
                "library=" + library +
                '}';
    }
}
