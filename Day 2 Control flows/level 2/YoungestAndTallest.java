import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age and height for Amar:");
        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        System.out.println("Enter age and height for Akbar:");
        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        System.out.println("Enter age and height for Anthony:");
        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

        // Find youngest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" :
                                (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Find tallest height
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" :
                               (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("Youngest friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + tallestHeight + ")");
    }
}



































































