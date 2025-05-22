import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;

        // Step 2: Count number of digits
        int digitCount = 0;
        int tempCount = temp;
        while (tempCount != 0) {
            digitCount++;
            tempCount /= 10;
        }

        // Step 3: Store digits in array
        int[] digits = new int[digitCount];
        int index = 0;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        // Step 4: Display reversed digits (already stored in reverse)
        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}













































