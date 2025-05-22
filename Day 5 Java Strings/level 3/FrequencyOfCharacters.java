import java.util.Scanner;

public class FrequencyOfCharacters {

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

    public static String[][] frequency(String str) {
        int len = stringLength(str);
        int[] freq = new int[256];

        // Count frequencies
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        // Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[idx][0] = Character.toString((char) i);
                result[idx][1] = Integer.toString(freq[i]);
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freqResult = frequency(text);
        System.out.println("Character : Frequency");
        for (String[] entry : freqResult) {
            System.out.println(entry[0] + " : " + entry[1]);
        }

        sc.close();
    }
}















