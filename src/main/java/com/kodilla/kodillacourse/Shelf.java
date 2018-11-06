package com.kodilla.kodillacourse;

import java.util.ArrayList;

public class Shelf {
    private String shelfName;
    private int shelfSize;
    private int remainingShelfSize;
    private ArrayList<Book> books = new ArrayList<>();

    public Shelf(String shelfName, int shelfSize) {
        this.shelfName = shelfName;
        this.shelfSize = shelfSize;
        remainingShelfSize = shelfSize;
    }

    public void addBook(Book book) {
        if ( remainingShelfSize > 0 ) {
            books.add(book);
            book.setShelf(this);
            remainingShelfSize -= 1;
            System.out.println("Książka " + book.getAuthor() + "/" + book.getTitle() + " została dodana do półki " + shelfName + ".");
        } else {
            System.out.println("Półka " + shelfName + " jest pełna, nie można dodać książki " + book.getAuthor() + "/" + book.getTitle() + "." );
        }
    }

    public boolean removeBook(Book book) {
        int orginalSizeShelf = books.size();
        for (Book b : books) {
            if ( book.equals(b) ) {
                books.remove(book);
                book.setShelf(null);
                remainingShelfSize -= 1;
                System.out.println("Książka " + book.getAuthor() + "/" + book.getTitle() + " została usunięta z półki " + shelfName + ".");
                return true;
            }
        }
        System.out.println("Nie znaleziono książki " + book.getAuthor() + "/" + book.getTitle() + " na półce " + shelfName + "." );
        return false;
    }

    public int getRemainingShelfSize() {
        return remainingShelfSize;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void moveBook(Book book, Shelf shelf) {
        if ( book.getShelf() != null ) {
            book.getShelf().removeBook(book);
        }
        shelf.addBook(book);
    }

    public void getBooksList() {
        System.out.println("Półka " + shelfName);
        System.out.println("-----------------------");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
