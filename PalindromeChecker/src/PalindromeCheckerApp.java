/*
 * MAIN CLASS - PalindromeCheckerApp
 * UC9 : Recursive Palindrome Checker
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Validates a palindrome using recursion
 * - comparing start and end characters
 * - Displays formatted result on console
 *
 *
 * @author Aditya
 * @version 9.0
 */


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    private static boolean check(String s, int start, int end){
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
}