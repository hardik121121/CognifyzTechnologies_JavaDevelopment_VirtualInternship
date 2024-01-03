package Level_2_CognifyzTechnologies;

import java.util.*;

public class Task_2_PasswordStrengthChecker{
    public static void maiin(String[] args){
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    
    int length = password.length();
    boolean hasUppercase = !password.equals(password.toLowerCase());
    boolean hasLowercase = !password.equals(password.toUpperCase());
    boolean hasDigit = password.matches(".*\\d.*");
    boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");

    
    System.out.println("Password Strength Analysis:");

    
    System.out.println("Length: " + length + " characters");
    if (length < 8) {
        System.out.println("   - Weak: Password is too short");
    } else if (length >= 8 && length < 12) {
        System.out.println("   - Moderate: Password length is okay");
    } else {
        System.out.println("   - Strong: Password length is good");
    }

    
    System.out.println("Uppercase: " + (hasUppercase ? "Present" : "Absent"));

    
    System.out.println("Lowercase: " + (hasLowercase ? "Present" : "Absent"));

    
    System.out.println("Numbers: " + (hasDigit ? "Present" : "Absent"));


    System.out.println("Special Characters: " + (hasSpecialChar ? "Present" : "Absent"));

    
    if (length >= 8 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
        System.out.println("Overall: Strong password");
    } else if (length >= 8 && (hasUppercase || hasLowercase || hasDigit || hasSpecialChar)) {
        System.out.println("Overall: Moderate password");
    } else {
        System.out.println("Overall: Weak password");
    }

    scanner.close();
    }
}