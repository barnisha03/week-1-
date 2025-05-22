import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing invalid index: names.length (valid max index is names.length-1)
        System.out.println("Name: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException safely
    public static void handleException(String[] names) {
        try {
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index accessed.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i+1) + ": ");
            names[i] = sc.nextLine();
        }

        // Uncomment to generate exception (program will stop abruptly)
        // generateException(names);

        handleException(names);

        sc.close();
    }
}



