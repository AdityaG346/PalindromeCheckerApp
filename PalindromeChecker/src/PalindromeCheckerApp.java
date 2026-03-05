/**
 * =========================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =========================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author Aditya
 * @version 11.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        // Normalize the string (Removing non-alphanumeric and lowering case)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Instantiate the service (Object-Oriented approach)
        PalindromeService service = new PalindromeService();

        // Execute validation
        boolean isPalindrome = service.checkPalindrome(normalized);

        // Output results
        System.out.println("Original:   " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * Uses the two-pointer technique for efficiency.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers as per the hint
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // All characters matched
    }
}