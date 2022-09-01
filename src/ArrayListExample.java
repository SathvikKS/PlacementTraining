import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        l.add(12);
        l.add(10.4);
        l.add(10.4);
        System.out.println(l);
        System.out.println("Iterator");
        Iterator itr = l.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        l.remove(10.4);
        System.out.println("\nList Iterator");
        ListIterator litr = l.listIterator();
        while(litr.hasNext())
            System.out.print(litr.next()+" ");
        System.out.println("\nListIterator - previous");
        while(litr.hasPrevious())
            System.out.print(litr.previous()+" ");
    }
}
