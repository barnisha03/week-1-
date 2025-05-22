public class SpringSeason {

    // Method to check if given month and day fall in Spring Season (March 20 - June 20)
    public static boolean isSpringSeason(int month, int day) {
        if (month < 3 || month > 6) {
            return false; // Outside March to June
        }

        if (month == 3) {
            return day >= 20; // From March 20 onwards
        } else if (month == 6) {
            return day <= 20; // Up to June 20
        } else {
            return true; // April and May are fully in spring
        }
    }

    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide two integers: month and day");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Invalid month or day input.");
                return;
            }

            if (isSpringSeason(month, day)) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers for month and day.");
        }
    }
}




















