import java.util.*;
public class Task_2_PalindromeChecker {
    public static boolean isPalindrome(String str) {
        
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Enter a word or phrase to check if it's a palindrome:");
        String userInput = sc.nextLine();


        if (isPalindrome(userInput)) {
            System.out.println("'" + userInput + "' is a palindrome.");
        } else {
            System.out.println("'" + userInput + "' is not a palindrome.");
        }
      
    sc.close();; 
 }
    
}
