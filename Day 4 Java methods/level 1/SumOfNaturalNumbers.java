import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum of n natural numbers using loop
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            int result = sumNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }

        scanner.close();
    }
}





















