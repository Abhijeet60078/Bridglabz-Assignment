import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is positive even");
                else
                    System.out.println(num + " is positive odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater");
        } else {
            System.out.println("Last element is greater");
        }
    }
}
