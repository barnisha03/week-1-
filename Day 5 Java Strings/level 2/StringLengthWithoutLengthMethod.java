import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When charAt throws exception, we return count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int lengthWithoutLength = findLength(input);
        int lengthWithLength = input.length();

        System.out.println("Length without length(): " + lengthWithoutLength);
        System.out.println("Length with length(): " + lengthWithLength);

        sc.close();
    }
}




