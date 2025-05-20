//1.Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) 
//using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.*;

public class LinkedListIterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        Iterator<String> iterator = list.listIterator(1); // Start from 2nd (index 1)
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
