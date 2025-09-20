/*package Constructor;

public class constructor {
    class CoffeeShopOrder {
        // Attributes
        String customerName;
        String coffeeType;
        int quantity;
        double totalPrice;

        // Default Constructor
        CoffeeShopOrder() {
            customerName = "Guest";
            coffeeType = "Regular";
            quantity = 1;
            totalPrice = calculatePrice();
        }

        // Parameterized Constructor
        CoffeeShopOrder(String customerName, String coffeeType, int quantity) {
            this.customerName = customerName;
            this.coffeeType = coffeeType;
            this.quantity = quantity;
            this.totalPrice = calculatePrice();
        }

        // Copy Constructor
        CoffeeShopOrder(CoffeeShopOrder previousOrder) {
            this.customerName = previousOrder.customerName;
            this.coffeeType = previousOrder.coffeeType;
            this.quantity = previousOrder.quantity;
            this.totalPrice = previousOrder.totalPrice;
        }

        // Method to calculate price
        private double calculatePrice() {
            double pricePerCup = switch (coffeeType.toLowerCase()) {
                case "latte" -> 5.0;
                case "espresso" -> 4.0;
                case "cappuccino" -> 4.5;
                default -> 3.0; // Regular coffee
            };
            return pricePerCup * quantity;
        }

        // Display Order Details
        void displayOrderDetails() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price: $" + totalPrice);
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Default Constructor
            CoffeeShopOrder order1 = new CoffeeShopOrder();
            System.out.println("Order 1:");
            order1.displayOrderDetails();

            // Parameterized Constructor
            CoffeeShopOrder order2 = new CoffeeShopOrder("Alice", "Latte", 3);
            System.out.println("\nOrder 2:");
            order2.displayOrderDetails();

            // Copy Constructor
            CoffeeShopOrder order3 = new CoffeeShopOrder(order2);
            System.out.println("\nOrder 3 (Copy of Order 2):");
            order3.displayOrderDetails();
        }
    }
}
*/