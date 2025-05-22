import java.util.Scanner;
public class FeetConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int feet = input.nextInt();
        double yards = feet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}























































































