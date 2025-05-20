//4.Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.*;

public class ArrayListSubList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        List<String> subList = colors.subList(0, 2);
        System.out.println("Sublist (1st and 2nd): " + subList);
    }
}
