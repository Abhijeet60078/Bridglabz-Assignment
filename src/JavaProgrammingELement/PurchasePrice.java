package JavaProgrammingELement;

import java.util.*;
public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double unitPrice = sc.nextDouble();

        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("total purchase price is " + totalPrice +
                "quantity " + quantity + " and unit price is  " + unitPrice);
    }
}
