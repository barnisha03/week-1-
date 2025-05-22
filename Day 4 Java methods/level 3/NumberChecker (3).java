import java.util.Arrays;

public class NumberChecker {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Sum digits of a number
    private static int sumDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Product digits of a number
    private static int productDigits(int number) {
        number = Math.abs(number);
        int product = 1;
        if (number == 0) return 0; // edge case
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    // Check if a number is neon
    // Neon number: sum of digits of square equals the number itself
    public static boolean isNeon(int number) {
        int square = number * number;
        return sumDigits(square) == number;
    }

    // Check if a number is a spy number
    // Sum of digits == product of digits
    public static boolean isSpy(int number) {
        return sumDigits(number) == productDigits(number);
    }

    // Check if a number is automorphic
    // Square ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }

    // Check if a number is a buzz number
    // Divisible by 7 or ends with 7
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int[] testNumbers = {7, 153, 370, 371, 407, 5, 25, 21, 1729, 28, 17};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Is prime? " + isPrime(num));
            System.out.println("Is neon? " + isNeon(num));
            System.out.println("Is spy? " + isSpy(num));
            System.out.println("Is automorphic? " + isAutomorphic(num));
            System.out.println("Is buzz? " + isBuzz(num));
            System.out.println("--------------------------");
        }
    }
}




































