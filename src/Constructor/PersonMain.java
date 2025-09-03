package Constructor;

public class PersonMain {
    public static void main(String[] args) {
        // Create original person
        Person p1 = new Person("Abhijeet", 20);


        Person p2 = new Person(p1);

        // Display both
        p1.display();
        p2.display();
    }
}

