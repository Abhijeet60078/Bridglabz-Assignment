package inhertiance;
// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking delicious food.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}

// Main
public class RestaurentTest {
    public static void main(String[] args) {
        Worker w1 = new Chef("Ramesh", 1);
        Worker w2 = new Waiter("Suresh", 2);

        w1.performDuties();
        w2.performDuties();
    }
}
