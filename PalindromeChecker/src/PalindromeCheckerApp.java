/*
 * MAIN CLASS - PalindromeCheckerApp
 * UC6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Validates a palindrome by using both Queue (FIFO)
 * - and Stack (LIFO) data structures to compare characters.
 * - Displays formatted result on console
 *
 *
 * @author Aditya Gupta
 * @version 6.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()){
                isPalindrome=false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}