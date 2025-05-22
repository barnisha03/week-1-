import java.util.Scanner;

public class TrimWithoutBuiltIn {

    // Find start and end indexes after trimming leading and trailing spaces
    public static int[] findTrimIndexes(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}

        int start = 0;
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }

        int end = length - 1;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Create substring from start to end using charAt()
    public static String substringCustom(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Compare two strings char by char, return true if equal
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;

        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading/trailing spaces:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);

        // Handle edge case: all spaces (start > end)
        String trimmedCustom = (indexes[0] <= indexes[1]) ? substringCustom(input, indexes[0], indexes[1]) : "";

        String trimmedBuiltIn = input.trim();

        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));

        sc.close();
    }
}











