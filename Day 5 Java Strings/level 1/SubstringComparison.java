import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt
    public static String createSubstring(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String text = sc.next();

        System.out.print("Enter start index (inclusive): ");
        int start = sc.nextInt();

        System.out.print("Enter end index (exclusive): ");
        int end = sc.nextInt();

        try {
            String substrCharAt = createSubstring(text, start, end);
            String substrBuiltin = text.substring(start, end);

            System.out.println("Substring created using charAt(): " + substrCharAt);
            System.out.println("Substring created using substring(): " + substrBuiltin);

            boolean isSame = compareStrings(substrCharAt, substrBuiltin);
            System.out.println("Are both substrings equal? " + isSame);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
