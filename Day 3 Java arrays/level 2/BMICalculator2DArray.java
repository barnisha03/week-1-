import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Step 2: Declare 2D array for weight, height, BMI and 1D array for status
        double[][] personData = new double[number][3]; // [][0] = weight, [][1] = height, [][2] = BMI
        String[] weightStatus = new String[number];

        // Step 3: Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter data for Person " + (i + 1));

            // Input and validate weight
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive number. Try again.");
                }
            } while (weight <= 0);

            // Input and validate height
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number. Try again.");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Step 4: Calculate and store BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display all data
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}













































