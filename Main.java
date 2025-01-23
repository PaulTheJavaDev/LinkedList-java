import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(6);
        list.add(36);
        list.add(19);
        list.add(45);
        System.out.print("Elements before reversing: " + list);
        list = reverseLinkedList(list);
        System.out.print("\nElements after reversing: " + list);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {

            revLinkedList.add(list.get(i));
        }
        return revLinkedList;
    }

}
