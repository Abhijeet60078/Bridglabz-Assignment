package OOpsDesignPrinciple;

import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();
    Order(int orderId) { this.orderId = orderId; }

    void addProduct(Product p) { products.add(p); }

    void showOrder() {
        System.out.println("Order #" + orderId + " contains:");
        for (Product p : products) System.out.println(" - " + p.name + " : $" + p.price);
    }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();
    Customer(String name) { this.name = name; }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order #" + o.orderId);
    }
}

public class EcommerceTest {
    public static void main(String[] args) {
        Customer c = new Customer("Anjali");
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 1000);

        Order o1 = new Order(1);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c.placeOrder(o1);
        o1.showOrder();
    }
}
