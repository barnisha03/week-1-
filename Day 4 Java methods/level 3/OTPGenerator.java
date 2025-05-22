public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() returns double between 0.0 and 1.0
        // Multiply by 900000 and add 100000 to get range 100000 to 999999 inclusive
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in array are unique
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println((i + 1) + ": " + otpArray[i]);
        }

        if (areUnique(otpArray)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
    }
}






































