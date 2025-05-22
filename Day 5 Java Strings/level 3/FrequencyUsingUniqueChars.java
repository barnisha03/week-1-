import java.util.Scanner;

public class FrequencyUsingUniqueChars {

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

    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str);
        char[] temp = new char[len];
        int uniqueCount = 0;

        outer:
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) continue outer;
            }
            temp[uniqueCount++] = ch;
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static String[][] frequencyUsingUnique(String str) {
        int len = stringLength(str);
        int[] freq = new int[256];

        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freqResult = frequencyUsingUnique(text);
        System.out.println("Character : Frequency");
        for (String[] entry : freqResult) {
            System.out.println(entry[0] + " : " + entry[1]);
        }

        sc.close();
    }
}

 















