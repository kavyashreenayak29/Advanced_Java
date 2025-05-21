//4.Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString().
package String_Functions;
import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        System.out.println(generateRandom(8));
    }

    public static String generateRandom(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
