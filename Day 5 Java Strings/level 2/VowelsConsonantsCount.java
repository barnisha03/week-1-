import java.util.Scanner;

public class VowelsConsonantsCount {

    public static String checkChar(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + ('a' - 'A'));
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        int length = 0;

        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }

        for (int i = 0; i < length; i++) {
            String result = checkChar(str.charAt(i));
            if (result.equals("Vowel")) vowels++;
            else if (result.equals("Consonant")) consonants++;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countVowelsAndConsonants(input);

        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);

        sc.close();
    }
}









