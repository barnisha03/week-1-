import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Generate random ages (2-digit) for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10;  // Random ages from 10 to 91
        }
        return ages;
    }

    // Check voting eligibility: return 2D array with age and "true"/"false"
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";  // negative age invalid
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] eligibility = checkEligibility(ages);

        displayTable(eligibility);

        sc.close();
    }
}












