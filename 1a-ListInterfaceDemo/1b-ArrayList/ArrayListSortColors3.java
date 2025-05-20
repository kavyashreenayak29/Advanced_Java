//3.Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.*;

public class ArrayListSortColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Before sorting: " + colors);

        Collections.sort(colors);
        System.out.println("After sorting: " + colors);
    }
}
