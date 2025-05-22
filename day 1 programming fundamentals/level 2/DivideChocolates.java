import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int each = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets " + each + " chocolates and the number of remaining chocolates are " + remaining);
    }
}















































































