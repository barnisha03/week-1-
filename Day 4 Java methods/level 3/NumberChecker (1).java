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

    // Method to store digits of the number in a digits array (most significant digit at index 0)
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

    // Method to find the sum of the digits of a number using digits array
    public static int sumOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find the sum of squares of the digits of a number using digits array (using Math.pow)
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    // A number is Harshad if divisible by sum of its digits
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        if (sum == 0) return false; // avoid divide by zero
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    // Returns a 2D array: first column digit, second column frequency
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int count = 0; // count how many digits appear at least once
        for (int f : freq) {
            if (f > 0) count++;
        }
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int testNumber = 1729;

        System.out.println("Number: " + testNumber);
        System.out.println("Count of digits: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(getDigits(testNumber)));
        System.out.println("Sum of digits: " + sumOfDigits(testNumber));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(testNumber));
        System.out.println("Is Harshad number? " + isHarshadNumber(testNumber));
        System.out.println("Digit frequencies:");
        int[][] freq = digitFrequency(testNumber);
        for (int[] pair : freq) {
            System.out.println("Digit " + pair[0] + " occurs " + pair[1] + " times");
        }
    }
}


































