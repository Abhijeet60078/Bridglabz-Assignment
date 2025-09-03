package ControlFLowLevel2;

import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (< 100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 1; i * number < 100; i++) {
            System.out.println(i * number);
        }
    }
}
