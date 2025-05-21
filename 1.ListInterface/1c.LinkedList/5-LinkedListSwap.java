//5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
import java.util.*;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Before swap: " + list);
        if (list.size() >= 3) {
            Collections.swap(list, 0, 2);
            System.out.println("After swapping first and third: " + list);
        } else {
            System.out.println("Not enough elements to swap.");
        }
    }
}
