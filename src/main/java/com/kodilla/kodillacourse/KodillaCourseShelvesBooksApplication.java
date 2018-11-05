package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseShelvesBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseShelvesBooksApplication.class, args);

        Book b1 = new Book();
        b1.addBook("author 1","title 1");
        Book b2 = new Book();
        b2.addBook("author 2","title 2");
        Book b3 = new Book();
        b3.addBook("author 3","title 3");
        Book b4 = new Book();
        b4.addBook("author 4","title 4");
        Book b5 = new Book();
        b5.addBook("author 5","title 5");

        Shelf s1 = new Shelf("polka 1", 3);
        s1.addBook(b1);
        s1.addBook(b2);
        s1.addBook(b3);
        s1.addBook(b4);
        s1.addBook(b5);

        Shelf s2 = new Shelf("polka 2", 2);

        System.out.println("----------------------");
        System.out.println(b1.getShelfName());
        System.out.println(b2.getShelfName());
        System.out.println(b3.getShelfName());
        System.out.println(b4.getShelfName());
        System.out.println(b5.getShelfName());
        System.out.println("----------------------");

        s1.removeBook(b1);
        System.out.println("----------------------");
        System.out.println(b1.getShelfName());
        System.out.println("----------------------");
        s2.moveBook(b1,s2);
        System.out.println("----------------------");
        System.out.println(b1.getShelfName());
        System.out.println("----------------------");
        s2.moveBook(b2,s2);

        s1.getBooksList();
        s2.getBooksList();
    }
}
