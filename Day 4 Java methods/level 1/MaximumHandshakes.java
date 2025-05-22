import java.util.Scanner;

public class MaximumHandshakes {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("There must be at least 2 students for handshakes.");
        } else {
            int maxHandshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
        }

        scanner.close();
    }
}



















