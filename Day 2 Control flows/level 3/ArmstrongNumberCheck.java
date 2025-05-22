import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;       // get last digit
            sum += digit * digit * digit;           // add cube of digit to sum
            originalNumber = originalNumber / 10;   // remove last digit
        }

        if (sum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is NOT an Armstrong number.");
    }
}


























































