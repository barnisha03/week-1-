import java.util.Scanner;

public class LineAndDistance {

    // Method to calculate Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find slope and y-intercept of line through two points
    // Returns array where result[0] = slope (m), result[1] = y-intercept (b)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        
        if (x2 == x1) {
            // Line is vertical; slope is undefined.
            // For this example, we will use Double.POSITIVE_INFINITY to indicate undefined slope.
            result[0] = Double.POSITIVE_INFINITY;
            result[1] = Double.NaN;  // y-intercept not defined for vertical line
        } else {
            double m = (y2 - y1) / (x2 - x1);  // slope
            double b = y1 - m * x1;            // y-intercept
            result[0] = m;
            result[1] = b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between points: " + distance);

        // Find line equation
        double[] line = findLineEquation(x1, y1, x2, y2);

        if (line[0] == Double.POSITIVE_INFINITY) {
            System.out.println("The line is vertical with equation: x = " + x1);
        } else {
            System.out.println("Equation of the line: y = " + line[0] + " * x + " + line[1]);
        }

        sc.close();
    }
}







































