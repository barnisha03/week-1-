import java.util.Scanner;

public class ZaraBonusProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Arrays to store [salary, years of service]
        double[][] employeeData = new double[10][2];

        // Step 2: Arrays to store [new salary, bonus amount]
        double[][] newSalaryAndBonus = new double[10][2];

        // Step 3: Totals
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Step 4: Input loop with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter 5-digit Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (salary < 10000 || salary > 99999 || years < 0) {
                System.out.println("Invalid input! Please enter valid salary (10000-99999) and years (>= 0). Try again.\n");
                i--; // Repeat this iteration
            } else {
                employeeData[i][0] = salary;
                employeeData[i][1] = years;
            }
        }

        // Step 5: Compute bonus, new salary and totals
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonus;

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        // Step 6: Display employee-wise data
        System.out.println("\n------------------ Employee Bonus Details ------------------");
        System.out.printf("%-10s %-12s %-18s %-14s %-14s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12.2f %-18.0f %-14.2f %-14.2f\n",
                    (i + 1),
                    employeeData[i][0],
                    employeeData[i][1],
                    newSalaryAndBonus[i][1],
                    newSalaryAndBonus[i][0]);
        }

        // Step 7: Display totals
        System.out.println("\n------------------ Total Summary ------------------");
        System.out.printf("Total Old Salary : %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid : %.2f\n", totalBonus);
        System.out.printf("Total New Salary : %.2f\n", totalNewSalary);
    }
}









































