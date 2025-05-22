import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException by substring(start > end)
    public static void generateException(String text) {
        // This will throw IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 3));
    }

    // Method to handle IllegalArgumentException safely
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Uncomment to generate exception (program will stop abruptly)
        // generateException(input);

        handleException(input);
        sc.close();
    }
}

