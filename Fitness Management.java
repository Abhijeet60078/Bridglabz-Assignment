import java.util.Scanner;

public class FitnessManagemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean open = true; 

        do {
            System.out.print("Enter number of members to register: ");
            int n = sc.nextInt();

           
            for (int i = 1; i <= n; i++) {
                System.out.println("\n--- Registering Member " + i + " ---");

                
                System.out.println("Choose Membership Type:");
                System.out.println("1. Monthly (₹1000)");
                System.out.println("2. Quarterly (₹2500)");
                System.out.println("3. Yearly (₹9000)");
                int choice = sc.nextInt();

                int fee = 0;
                switch (choice) {
                    case 1: fee = 1000; break;
                    case 2: fee = 2500; break;
                    case 3: fee = 9000; break;
                    default: System.out.println("Invalid choice! Defaulting to Monthly.");
                             fee = 1000;
                }

                
                System.out.print("Are you a Student (S) or Senior Citizen (C)? (Y/N): ");
                char disc = sc.next().charAt(0);

                if (disc == 'Y' || disc == 'y') {
                    fee = fee - (fee * 20 / 100); 
                }

                System.out.println("Final Fee for Member " + i + " = ₹" + fee);
            }

          
            System.out.print("\nDo you want to register more members? (Y/N): ");
            char more = sc.next().charAt(0);
            if (more == 'N' || more == 'n') {
                open = false;
            }

        } while (open); 

        System.out.println("\nGym closed. No more registrations!");
        sc.close();
    }
}
