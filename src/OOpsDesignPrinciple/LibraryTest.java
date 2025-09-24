package OOpsDesignPrinciple;
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Guide", "Guido van Rossum");

        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b1);  // same book in another library

        l1.showLibraryBooks();
        l2.showLibraryBooks();
    }
}
