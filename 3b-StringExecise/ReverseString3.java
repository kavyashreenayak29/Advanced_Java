//3.Write a Java Program for Reversing the characters in a string using user defined function reverseString().
package String_Functions;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Java";
        System.out.println(reverse(input));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
