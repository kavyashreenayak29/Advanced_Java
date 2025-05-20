//5.Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
import java.util.*;

public class ArrayListRemoveNth {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));
        int n = 3; 
        if (n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing " + (n + 1) + "th element: " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}
