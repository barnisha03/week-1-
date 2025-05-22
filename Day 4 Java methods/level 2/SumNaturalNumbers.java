import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to find sum
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    // Formula method to find sum
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (>= 1): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Number must be natural (>= 1).");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumForm = formulaSum(n);

        System.out.println("Sum by recursion: " + sumRec);
        System.out.println("Sum by formula: " + sumForm);

        if (sumRec == sumForm) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("Results differ, check logic.");
        }
    }
}




























