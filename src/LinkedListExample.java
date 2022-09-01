import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        l.add("three");
        l.add("one");
        System.out.println(l);
        l.remove("one");
        System.out.println(l);
        l.removeLastOccurrence("one");
        System.out.println(l);
        l.removeFirstOccurrence("three");
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
    }
}
