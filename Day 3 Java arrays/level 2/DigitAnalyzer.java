import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; // max size of array
        int[] digits = new int[maxDigit];
        int index = 0;

        int temp = number;

        // Step 2: Extract digits and store in array
        while (temp != 0) {
            int digit = temp % 10;
            if (index == maxDigit) break; // max size reached
            digits[index++] = digit;
            temp /= 10;
        }

        // Step 3: Initialize largest and second largest
        int largest = -1, secondLargest = -1;

        // Step 4: Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 5: Display results
        System.out.println("Digits extracted:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}












































