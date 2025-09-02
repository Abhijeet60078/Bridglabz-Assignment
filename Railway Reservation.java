import java.util.*;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int totalSeats = 5; 
        int bookedSeats = 0;

        boolean bookingOpen = true;

        do {
            System.out.println("\n--- Railway Reservation System ---");
            System.out.println("Available Trains:");
            System.out.println("1. Express (Fare: ₹500)");
            System.out.println("2. Superfast (Fare: ₹800)");
            System.out.println("3. Rajdhani (Fare: ₹1500)");
            System.out.print("Choose train: ");
            int choice = sc.nextInt();

            int fare = 0;
            switch (choice) {
                case 1: fare = 500; break;
                case 2: fare = 800; break;
                case 3: fare = 1500; break;
                default: System.out.println("Invalid choice! Defaulting to Express.");
                         fare = 500;
            }

           
            System.out.print("Enter number of passengers to book: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                if (bookedSeats < totalSeats) {
                    bookedSeats++;
                    System.out.println("Passenger " + i + " booked successfully! Seat No: " + bookedSeats + " | Fare: ₹" + fare);
                } else {
                    System.out.println("Passenger " + i + " → No seat available! Added to Waiting List.");
                }
            }

           
            if (bookedSeats >= totalSeats) {
                System.out.println("\nTrain is FULL. No more bookings allowed!");
                bookingOpen = false;
            } else {
                System.out.print("\nDo you want to continue booking? (Y/N): ");
                char more = sc.next().charAt(0);
                if (more == 'N' || more == 'n') {
                    bookingOpen = false;
                }
            }

        } while (bookingOpen); 
        System.out.println("\nReservation closed. Total seats booked = " + bookedSeats + "/" + totalSeats);
        sc.close();
    }
}
