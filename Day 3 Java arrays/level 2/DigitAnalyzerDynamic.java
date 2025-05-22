import java.util.Scanner;

public class DigitAnalyzerDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;

        int maxDigit = 10;  // Initial size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 2: Extract digits, expand array if full
        while (temp != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase size by 10
                int[] tempArray = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i]; // Copy old data
                }
                digits = tempArray; // Reassign
            }
            digits[index++] = temp % 10; // Store digit
            temp /= 10; // Remove digit
        }

        // Step 3: Initialize largest and second largest
        int largest = -1, secondLargest = -1;

        // Step 4: Loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 5: Display digits and results
        System.out.println("Digits extracted:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}












































