import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing an index beyond the length of the string causes exception
        System.out.println("Character at invalid index: " + text.charAt(text.length())); // Index out of bound
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length())); // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Uncomment to see exception generated (will crash program)
        // generateException(input);

        // Call method that handles exception safely
        handleException(input);

        sc.close();
    }
}
