package JavaProgrammingELement;

import java.util.Scanner;

public class AreaofTrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();

        double height = sc.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
