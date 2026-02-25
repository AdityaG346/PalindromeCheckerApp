/*
 *MAIN CLASS - PalindromeCheckerApp
 *UC3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings and displays result on console
 *
 *
 * @author Aditya Gupta
 * @version 3.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = new String("MADAM");
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}