/*
 * MAIN CLASS - PalindromeCheckerApp
 * UC7: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Validates a palindrome using a Deque by
 * - comparing front and rear characters directly.
 * - Displays formatted result on console
 *
 *
 * @author Aditya Gupta
 * @version 7.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}