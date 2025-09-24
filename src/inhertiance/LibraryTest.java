package inhertiance;

// Superclass
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main
public class LibraryTest {
    public static void main(String[] args) {
        Author a = new Author("Java Programming", 2023, "James Gosling", "Father of Java");
        a.displayInfo();
    }
}
