//3.Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
import java.util.*;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green"));
        list.offerLast("Pink");
        System.out.println("After inserting at end: " + list);
    }
}
