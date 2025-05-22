import java.util.Random;

public class ZaraBonus {

    // Method to generate salary and years of service for 10 employees
    // Salary: 5-digit number between 10000 and 99999
    // Years of service: between 1 and 10
    public static int[][] generateSalaryAndService() {
        int[][] salaryAndService = new int[10][2];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int salary = rand.nextInt(90000) + 10000;  // 10000 to 99999
            int years = rand.nextInt(10) + 1;          // 1 to 10 years
            salaryAndService[i][0] = salary;
            salaryAndService[i][1] = years;
        }

        return salaryAndService;
    }

    // Method to calculate new salary and bonus based on years of service
    // Returns a 2D array: [newSalary, bonusAmount] for each employee
    public static double[][] calculateNewSalaryAndBonus(int[][] salaryAndService) {
        double[][] newSalaryAndBonus = new double[10][2];

        for (int i = 0; i < 10; i++) {
            int salary = salaryAndService[i][0];
            int years = salaryAndService[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonus;
        }

        return newSalaryAndBonus;
    }

    // Method to calculate and display sums of old salary, new salary, and total bonus
    public static void displaySummary(int[][] salaryAndService, double[][] newSalaryAndBonus) {
        int sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee | Old Salary | Years of Service | Bonus Amount | New Salary");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            int oldSalary = salaryAndService[i][0];
            int years = salaryAndService[i][1];
            double bonus = newSalaryAndBonus[i][1];
            double newSalary = newSalaryAndBonus[i][0];

            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%8d | %10d | %16d | %12.2f | %10.2f%n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("TOTAL    | %10d | %16s | %12.2f | %10.2f%n", sumOldSalary, "-", totalBonus, sumNewSalary);
    }

    public static void main(String[] args) {
        // Generate salaries and years of service
        int[][] salaryAndService = generateSalaryAndService();

        // Calculate new salaries and bonuses
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndService);

        // Display summary with totals
        displaySummary(salaryAndService, newSalaryAndBonus);
    }
}








































