
/*
 * MAIN CLASS - PalindromeCheckerApp
 * UC5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Validates a palindrome using a Stack.
 * - Characters are pushed into the stack and popped in reverse order for comparison.
 * - Displays formatted result on console
 *
 *
 * @author Aditya Gupta
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
