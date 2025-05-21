//1.Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
package String_Functions;

public class NullOrEmptyCheck {
    public static void main(String[] args) {
        String input = "   ";
        System.out.println(isNullOrEmpty(input));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
