import java.util.Scanner;

// Abstract class Transport
abstract class Transport {
    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);
}

// Bus class that extends Transport
class Bus extends Transport {
    @Override
    public double calculateFare(double distance) {
        double farePerKm = 1.5; // Example fare per km
        return distance * farePerKm;
    }
}

// Train class that extends Transport
class Train extends Transport {
    @Override
    public double calculateFare(double distance) {
        double farePerKm = 2.0; // Example fare per km
        return distance * farePerKm;
    }
}

// Flight class that extends Transport
class Flight extends Transport {
    @Override
    public double calculateFare(double distance) {
        double farePerKm = 5.0; // Example fare per km
        return distance * farePerKm;
    }
}

// Main class
public class TRANSPORT {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display transport options
        System.out.println("Select Transport Type:");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");

        // Get user's transport choice
        System.out.print("Enter choice (1/2/3): ");
        int choice = scanner.nextInt();

        // Get distance
        System.out.print("Enter the distance (in km): ");
        double distance = scanner.nextDouble();

        // Declare transport variable
        Transport transport = null;

        // Dynamically create the correct transport object based on user choice
        switch (choice) {
            case 1:
                transport = new Bus();
                break;
            case 2:
                transport = new Train();
                break;
            case 3:
                transport = new Flight();
                break;
            default:
                System.out.println("Invalid choice! Exiting program.");
                System.exit(0);
        }

        // Calculate and display the fare
        double fare = transport.calculateFare(distance);
        System.out.println("The fare for " + distance + " km is: " + fare);

        // Close the scanner
        scanner.close();
    }
}
