import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) { // optimized to number/2
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is NOT a prime number.");
    }
}

























































