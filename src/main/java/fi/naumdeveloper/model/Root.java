package fi.naumdeveloper.model;

import java.util.List;

public class Root {

    private List<Library> library;

    public List<Library> getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "Root{" +
                "library=" + library +
                '}';
    }
}