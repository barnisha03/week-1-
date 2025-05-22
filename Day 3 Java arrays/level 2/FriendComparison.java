import java.util.Scanner;

public class FriendComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        // Initialize with first friend's data
        int youngestIndex = 0;
        int minAge = ages[0];

        int tallestIndex = 0;
        double maxHeight = heights[0];

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Output results
        System.out.println("\nResults:");
        System.out.println("Youngest friend is: " + names[youngestIndex] + " (Age: " + minAge + ")");
        System.out.println("Tallest friend is: " + names[tallestIndex] + " (Height: " + maxHeight + " cm)");
    }
}











































