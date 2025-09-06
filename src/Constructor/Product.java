package Constructor;

public class Product {
    // Instance variables
    private String productName;
    private double price;


    private static int totalProducts = 0;


    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increase count when a product is created
    }


    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: ₹" + price);
    }


    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
