
/*
 *MAIN CLASS - PalindromeCheckerApp
 *UC2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Determines whether the string is a palindrome
 * - Displays result on console
 *
 *
 * @author Aditya Gupta
 * @version 2.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = new String("MADAM");
        String reversed;
        boolean isPalindrome = true;
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}
