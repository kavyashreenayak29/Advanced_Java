//8.Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric().
package String_Functions;

public class NumericCheck {
    public static void main(String[] args) {
        String input = "123456";
        System.out.println(isNumeric(input));
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
