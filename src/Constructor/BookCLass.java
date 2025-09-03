package Constructor;

public class BookCLass {
    String title;
    String author;
    double price;


    public BookCLass() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }


    public BookCLass(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void displayBook() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);

    }
}
