import java.util.Scanner;

public class PowerForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Error: Power must be positive.");
            return;
        }

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}






































































