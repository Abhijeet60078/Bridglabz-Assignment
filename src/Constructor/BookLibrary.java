package Constructor;


class Book {
    public String ISBN;       // public
    protected String title;   // protected
    private String author;    // private

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title +
                ", Author: " + getAuthor() +
                ", File Size: " + fileSize + "MB");
    }
}
