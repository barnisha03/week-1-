import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert to absolute in case of negative input
        number = Math.abs(number);

        // Array to store frequency of each digit (0–9)
        int[] frequency = new int[10];

        // Extract and count digits
        while (number > 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }

        // Display frequency
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurred " + frequency[i] + " time(s).");
            }
        }
    }
}















































