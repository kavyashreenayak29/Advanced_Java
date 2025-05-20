//10.Write a Java Program for Counting the number of words in a string using user defined function countWords().
package String_Functions;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Java is a programming language";
        System.out.println(countWords(input));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }
}
