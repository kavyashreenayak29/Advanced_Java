//7.Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate().
package String_Functions;

public class TruncateString {
    public static void main(String[] args) {
        String input = "This is a long sentence";
        System.out.println(truncate(input, 10));
    }

    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }
}
