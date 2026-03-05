import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =========================================================
 * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        String input = "racecar";
        PalindromeStrategy strategy = new StackStrategy();

        // Capture execution start time
        long startTime = System.nanoTime();

        // Execute the strategy
        boolean result = strategy.check(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display benchmarking results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
        System.out.println("Execution Time: " + duration + " nanoseconds");
    }
}

/**
 * Interface defining the contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based implementation of PalindromeStrategy.
 * Uses LIFO behavior to reverse characters for comparison.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}