import java.util.ArrayList;

public class NumberChecker {

    // Method to find factors of a number and return them as an array (including 1 and excluding the number itself)
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) { // Proper divisors exclude the number itself
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        // Convert to int[]
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    // Method to find the greatest factor using factors array
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static double productCubeFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Check if number is perfect
    // Perfect number = sum of proper divisors equals the number itself
    public static boolean isPerfect(int number) {
        int[] factors = findFactors(number);
        return sumFactors(factors) == number;
    }

    // Check if number is abundant
    // Abundant number = sum of proper divisors > number
    public static boolean isAbundant(int number) {
        int[] factors = findFactors(number);
        return sumFactors(factors) > number;
    }

    // Check if number is deficient
    // Deficient number = sum of proper divisors < number
    public static boolean isDeficient(int number) {
        int[] factors = findFactors(number);
        return sumFactors(factors) < number;
    }

    // Helper method to compute factorial of a digit
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Check if number is strong
    // Strong number = sum of factorial of digits equals number itself
    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 28, 15, 145, 496, 18};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            int[] factors = findFactors(num);
            System.out.println("Factors: " + java.util.Arrays.toString(factors));
            System.out.println("Greatest Factor: " + greatestFactor(factors));
            System.out.println("Sum of Factors: " + sumFactors(factors));
            System.out.println("Product of Factors: " + productFactors(factors));
            System.out.println("Product of Cubes of Factors: " + productCubeFactors(factors));
            System.out.println("Is Perfect? " + isPerfect(num));
            System.out.println("Is Abundant? " + isAbundant(num));
            System.out.println("Is Deficient? " + isDeficient(num));
            System.out.println("Is Strong? " + isStrong(num));
            System.out.println("-----------------------------------------");
        }
    }
}





































