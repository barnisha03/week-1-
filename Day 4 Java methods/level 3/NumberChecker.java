import java.util.Arrays;

public class NumberChecker {

    // Count digits in number
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Store digits in array (most significant digit at index 0)
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

    // Check if number is a duck number (has at least one zero digit after first digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Check if Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == number;
    }

    // Find largest and second largest digits
    public static int[] largestAndSecondLargest(int number) {
        int[] digits = getDigits(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int number) {
        int[] digits = getDigits(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int testNumber = 153;  // Example number

        System.out.println("Digits count: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(getDigits(testNumber)));
        System.out.println("Is Duck Number: " + isDuckNumber(testNumber));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(testNumber));

        int[] largest = largestAndSecondLargest(testNumber);
        System.out.println("Largest digit: " + largest[0] + ", Second largest digit: " + largest[1]);

        int[] smallest = smallestAndSecondSmallest(testNumber);
        System.out.println("Smallest digit: " + smallest[0] + ", Second smallest digit: " + smallest[1]);
    }
}


































