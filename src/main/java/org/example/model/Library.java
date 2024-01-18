package org.example.model;

public class Library {

    private int id;
    private String photo;
    private String author;
    private String nameBook;
    private String description;

    public Library(int id, String photo, String author, String nameBook, String description) {
        this.id = id;
        this.photo = photo;
        this.author = author;
        this.nameBook = nameBook;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
