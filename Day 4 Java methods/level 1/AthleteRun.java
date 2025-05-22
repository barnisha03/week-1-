import java.util.Scanner;

public class AthleteRun {

    // Method to calculate number of rounds to complete a given distance (5 km)
    public static int calculateRounds(double side1, double side2, double side3, double distanceKm) {
        double perimeter = side1 + side2 + side3;    // perimeter in meters
        double distanceMeters = distanceKm * 1000;   // convert km to meters

        // Calculate rounds, rounding up to next whole number
        return (int) Math.ceil(distanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangular park (in meters):");

        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3, 5.0);

        System.out.println("To complete a 5 km run, the athlete must run approximately " + rounds + " rounds around the park.");

        scanner.close();
    }
}


















