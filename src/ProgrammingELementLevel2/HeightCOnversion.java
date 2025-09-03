package ProgrammingELementLevel2;

import java.util.Scanner;

public class HeightCOnversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double heightCm = sc.nextDouble();

        double inches = heightCm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " +
                feet + " and inches is " + remainingInches);
    }
}
