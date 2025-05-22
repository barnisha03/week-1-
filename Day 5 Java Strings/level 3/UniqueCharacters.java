import java.util.Scanner;

public class UniqueCharacters {

    // Find length without using length()
    public static int stringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end
        }
        return length;
    }

    // Find unique characters and return them as a char array
    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str);
        char[] temp = new char[len]; // to store unique chars, max size = len
        int uniqueCount = 0;

        outer:
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            // Check if ch is already in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    continue outer; // already found
                }
            }
            temp[uniqueCount++] = ch; // new unique char
        }

        // Copy unique chars to exact-size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        System.out.println();

        sc.close();
    }
}














