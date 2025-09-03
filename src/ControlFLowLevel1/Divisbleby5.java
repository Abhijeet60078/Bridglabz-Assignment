package ControlFLowLevel1;

import java.util.Scanner;

public class Divisbleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean divisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);
    }
}
