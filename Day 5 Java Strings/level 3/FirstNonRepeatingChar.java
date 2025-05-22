import java.util.Scanner;

public class FirstNonRepeatingChar {

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

    public static char firstNonRepeating(String str) {
        int len = stringLength(str);
        int[] freq = new int[256]; // ASCII frequency

        // Calculate frequency
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        // Find first non-repeating
        for (int i = 0; i < len; i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // null char if none found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char firstNonRepeat = firstNonRepeating(text);
        if (firstNonRepeat != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}















