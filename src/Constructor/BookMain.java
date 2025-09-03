package Constructor;

public class BookMain {
    public static void main(String[] args) {
        BookCLass b1 = new BookCLass();
        BookCLass b2 = new BookCLass("Java Program", "Jai Bheem", 499.99);
        b1.displayBook();
        b2.displayBook();
    }
}
