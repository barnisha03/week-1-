import java.util.Scanner;

public class CharArrayComparison {

    // User-defined method to return characters as array without using toCharArray()
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] charsFromMethod = getCharsUsingCharAt(input);
        char[] charsFromBuiltin = input.toCharArray();

        System.out.println("Characters from user-defined method: ");
        for (char c : charsFromMethod) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters from built-in toCharArray(): ");
        for (char c : charsFromBuiltin) {
            System.out.print(c + " ");
        }
        System.out.println();

        boolean areEqual = compareCharArrays(charsFromMethod, charsFromBuiltin);
        System.out.println("Are both character arrays equal? " + areEqual);
    }
}
