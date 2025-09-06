package Constructor;
public class Main4 {
    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.9, "Computer Science");
        pg.displayDetails();
        pg.setCGPA(9.2);
        pg.displayDetails();


        EBook ebook = new EBook("ISBN123", "Java Programming", "James Gosling", 5.2);
        ebook.displayDetails();
        ebook.setAuthor("Oracle");
        ebook.displayDetails();


        SavingsAccount sa = new SavingsAccount(2001, "Bob", 10000, 5.5);
        sa.displayDetails();
        sa.deposit(2000);
        sa.displayDetails();


        Manager mgr = new Manager(301, "IT", 75000, 10);
        mgr.displayDetails();
        mgr.setSalary(80000);
        mgr.displayDetails();
    }
}
