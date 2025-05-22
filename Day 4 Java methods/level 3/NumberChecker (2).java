import java.util.Arrays;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array (most significant digit at index 0)
    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array and return new reversed array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using digits
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    // A duck number is a number that has a non-zero digit present in it
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test above methods
    public static void main(String[] args) {
        int[] testNumbers = { 12321, 1002, 0, 101, 70007, 0 };

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Count of digits: " + countDigits(num));
            System.out.println("Digits array: " + Arrays.toString(getDigits(num)));
            System.out.println("Reversed digits array: " + Arrays.toString(reverseDigits(getDigits(num))));
            System.out.println("Is palindrome? " + isPalindrome(num));
            System.out.println("Is duck number? " + isDuckNumber(num));
            System.out.println("---------------------------");
        }
    }
}



































