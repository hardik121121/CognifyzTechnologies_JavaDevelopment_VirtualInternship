import java.util.Random;
import java.util.Scanner;

public class Task_4_RandomPasswordGenerator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the desired length of the password: ");
        int passwordLength = scanner.nextInt();

        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        // Validate input
        if (!(includeNumbers || includeUppercase || includeLowercase || includeSpecialChars)) {
            System.out.println("Error: At least one option (numbers, uppercase, lowercase, special characters) must be selected.");
            return;
        }

        // Generate password
        String password = generateRandomPassword(passwordLength, includeNumbers, includeUppercase, includeLowercase, includeSpecialChars);

        // Display the generated password
        System.out.println("Your generated password is: " + password);

        // Close scanner
        scanner.close();
    }

    private static String generateRandomPassword(int length, boolean includeNumbers, boolean includeUppercase, boolean includeLowercase, boolean includeSpecialChars) {
        StringBuilder password = new StringBuilder();
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

        String validChars = "";
        if (includeLowercase) {
            validChars += lowercaseChars;
        }
        if (includeUppercase) {
            validChars += uppercaseChars;
        }
        if (includeNumbers) {
            validChars += numberChars;
        }
        if (includeSpecialChars) {
            validChars += specialChars;
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}