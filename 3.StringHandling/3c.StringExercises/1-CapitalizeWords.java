//1.Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords().
package String_Functions;

public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "java is fun";
        System.out.println(capitalize(input));
    }

    public static String capitalize(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }
}
