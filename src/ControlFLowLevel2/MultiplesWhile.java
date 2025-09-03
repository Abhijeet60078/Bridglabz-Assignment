package ControlFLowLevel2;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (< 100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");
        int multiple = number;
        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
    }
}
