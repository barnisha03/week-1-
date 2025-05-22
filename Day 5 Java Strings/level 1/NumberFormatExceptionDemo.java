import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // throws NumberFormatException if not a number
        System.out.println("Parsed number: " + num);
    }

    // Method to handle NumberFormatException safely
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numeric string: ");
        String input = sc.nextLine();

        // Uncomment to generate exception (program will stop abruptly)
        // generateException(input);

        handleException(input);
        sc.close();
    }
}


