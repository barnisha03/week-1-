import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for handshakes.");
        } else {
            // Calculate maximum handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
        }

        scanner.close();
    }
}


















