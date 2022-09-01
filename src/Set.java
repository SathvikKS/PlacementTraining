import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        //HashSet<String> set = new HashSet<>(); // no duplicate, no order
        //LinkedList<String> set = new LinkedList<>(); // duplicate, order
        TreeSet<String> set = new TreeSet<>(); // no duplicate, sorted
        set.add("One");
        set.add("Two");
        set.add("Four");
        set.add("Three");
        set.add("Five");
        set.add("Two");
        System.out.println(set);
    }
}
