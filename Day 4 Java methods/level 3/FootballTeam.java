import java.util.Arrays;

public class FootballTeam {

    // Method to generate random heights between 150 and 250 cm for 11 players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);  // 150 to 250 inclusive
        }
        return heights;
    }

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) shortest = h;
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) tallest = h;
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Heights of players (cm): " + Arrays.toString(heights));
        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm%n", findMean(heights));
    }
}

































