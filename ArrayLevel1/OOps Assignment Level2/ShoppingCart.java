class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " x" + quantity + " = " + getTotalCost());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Mouse", 1000, 2);

        item1.displayItem();
        item2.displayItem();

        double total = item1.getTotalCost() + item2.getTotalCost();
        System.out.println("Total Cart Cost: " + total);
    }
}
