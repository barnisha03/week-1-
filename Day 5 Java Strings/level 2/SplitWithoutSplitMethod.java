import java.util.Scanner;

public class SplitWithoutSplitMethod {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);

        // Count spaces to find number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words = spaceCount + 1
        String[] words = new String[spaceCount + 1];
        int[] spaceIndexes = new int[spaceCount];
        int si = 0;

        // Store space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[si++] = i;
            }
        }

        // Extract words using space indexes
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = (i == spaceCount) ? length : spaceIndexes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) {
                sb.append(text.charAt(j));
            }
            words[i] = sb.toString();
            start = end + 1;
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();

        String[] splitCustom = splitWords(text);
        String[] splitBuiltIn = text.split(" ");

        System.out.println("Custom split result:");
        for (String word : splitCustom) {
            System.out.println(word);
        }

        System.out.println("Built-in split result:");
        for (String word : splitBuiltIn) {
            System.out.println(word);
        }

        System.out.println("Are both splits equal? " + compareStringArrays(splitCustom, splitBuiltIn));

        sc.close();
    }
}






