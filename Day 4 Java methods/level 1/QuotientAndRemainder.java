import java.util.Scanner;

public class QuotientAndRemainder {

    // Method returns int array: index 0 = remainder, index 1 = quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number (dividend): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Division by zero is undefined.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }

        scanner.close();
    }
}























