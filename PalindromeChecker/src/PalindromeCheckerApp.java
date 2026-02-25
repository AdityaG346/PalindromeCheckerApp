
/*
 * MAIN CLASS - PalindromeCheckerApp
 * UC8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - This class validates a palindrome using a LinkedListy
 * - by comparing first and last characters.
 * - Displays formatted result on console
 *
 *
 * @author Aditya Gupta
 * @version 8.0
 */

import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";
        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
