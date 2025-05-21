//5.Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace().
package String_Functions;

public class WhitespaceRemover {
    public static void main(String[] args) {
        String input = "  Java   Programming  ";
        System.out.println(removeSpaces(input));
    }

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }
}
