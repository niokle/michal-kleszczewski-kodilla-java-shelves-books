package com.kodilla.kodillacourse;

public class Book {
    private String author;
    private String title;
    private Shelf shelf;

    public void addBook (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public String getShelfName() {
        if ( shelf == null ) {
            return "luzem";
        } else {
            return shelf.getShelfName();
        }
    }
}
