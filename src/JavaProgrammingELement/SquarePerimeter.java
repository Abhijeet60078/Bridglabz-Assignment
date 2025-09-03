package JavaProgrammingELement;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println(" length of  side is " + side + " perimeter is " + perimeter);
    }
}
