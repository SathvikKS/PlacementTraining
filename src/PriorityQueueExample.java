import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("amit");
        queue.add("vijay");
        queue.add("karan");
        queue.add("jai");
        queue.add("rahul");
        System.out.println("head: "+queue.element());
        System.out.println("head: "+queue.peek());
        System.out.println("iterating the queue elements");
        Iterator<String> i = queue.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");
        queue.remove();
        queue.poll();
        System.out.println("\nafter removing 2 elements");
        Iterator<String> i2 = queue.iterator();
        while(i2.hasNext())
            System.out.print(i2.next()+" ");
    }
}
