//2.Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
import java.util.*;

public class ArrayListRemoveColor {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original colors: " + colors);

        colors.remove(1); 
        colors.remove("Blue"); 
        System.out.println("After removals: " + colors);
    }
}
