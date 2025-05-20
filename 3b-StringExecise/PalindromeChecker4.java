//4.Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome().
package String_Functions;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "Madam, in Eden, I'm Adam";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
