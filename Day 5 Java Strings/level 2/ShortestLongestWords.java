import java.util.Scanner;

public class ShortestLongestWords {

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

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int[] spaceIndexes = new int[spaceCount];
        int si = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceIndexes[si++] = i;
        }

        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = (i == spaceCount) ? length : spaceIndexes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) sb.append(text.charAt(j));
            words[i] = sb.toString();
            start = end + 1;
        }

        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordLengths) {
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        int minIndex = -1, maxIndex = -1;

        for (int i = 0; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < minLen) {
                minLen = length;
                minIndex = i;
            }
            if (length > maxLen) {
                maxLen = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordsWithLengths(words);
        int[] indexes = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[indexes[0]][0] + " (Length: " + wordLengths[indexes[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[indexes[1]][0] + " (Length: " + wordLengths[indexes[1]][1] + ")");

        sc.close();
    }
}








