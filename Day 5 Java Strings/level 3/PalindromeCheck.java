import java.util.Scanner;

public class PalindromeCheck {

    public static int stringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return length;
    }

    // Logic 1: Compare start and end iteratively
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = stringLength(str) - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Using reversed array
    public static char[] reverseString(String str) {
        int len = stringLength(str);
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = str.charAt(len - 1 - i);
        }
        return reversed;
    }

    public static boolean isPalindromeUsingArray(String str) {
        int len = stringLength(str);
        char[] original = new char[len];
        for (int i = 0; i < len; i++) {
            original[i] = str.charAt(i);
        }
        char[] reversed = reverseString(str);

        for (int i = 0; i < len; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Using Iterative method: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive method: " + (isPalindromeRecursive(text, 0, stringLength(text) - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Array Reverse method: " + (isPalindromeUsingArray(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
















