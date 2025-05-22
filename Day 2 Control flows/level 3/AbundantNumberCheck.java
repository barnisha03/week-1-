import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find sum of divisors excluding the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }
}





























































