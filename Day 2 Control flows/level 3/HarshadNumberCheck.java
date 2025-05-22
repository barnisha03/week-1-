import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad Number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        // Calculate sum of digits
        while (temp != 0) {
            sum += temp % 10;  // add last digit
            temp /= 10;        // remove last digit
        }

        // Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}




























































