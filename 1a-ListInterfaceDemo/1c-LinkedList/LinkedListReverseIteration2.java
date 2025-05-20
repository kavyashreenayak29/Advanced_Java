//2.Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
import java.util.*;

public class LinkedListReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Iterator<String> descIterator = list.descendingIterator();
        System.out.println("Reverse iteration:");
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
