class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class HandlePhone {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 80000);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 120000);
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
