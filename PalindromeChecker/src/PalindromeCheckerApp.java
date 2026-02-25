/*
 * MAIN CLASS - PalindromeCheckerApp
 * UC4: Character Array Based Validation
 *
 * Description:
 * This class represents the palindrome checker app
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently and displays result on console
 *
 *
 * @author Aditya Gupta
 * @version 4.0
 */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = new String("MADAM");
        char[] charArray = input.toCharArray();

        int start=0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}