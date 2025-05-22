public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize to null
        // This line will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initialize to null
        try {
            // Attempt to access length() on null string
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call method on null object.");
        }
    }

    public static void main(String[] args) {
        // Uncomment below to see the exception generated (will crash program)
        // generateException();

        // Call method that handles the exception safely
        handleException();
    }
}

