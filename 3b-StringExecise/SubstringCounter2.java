//2.Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences().
package String_Functions;

public class SubstringCounter {
    public static void main(String[] args) {
        String main = "hello world hello";
        String sub = "hello";
        System.out.println(countOccurrences(main, sub));
    }

    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}
