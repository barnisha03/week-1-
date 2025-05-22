import java.util.Scanner;

public class StudentMarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Create a 2D array to store marks: [n][3] for Physics, Chemistry, Maths
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                double mark;
                do {
                    System.out.print(subject + " marks (0–100): ");
                    mark = sc.nextDouble();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input! Marks should be between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }

            // Calculate percentage
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15.2f %-10s%n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}














































