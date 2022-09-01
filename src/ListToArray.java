import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Mango");
        l.add("Banana");
        l.add("Apple");
        l.add("Strawberry");
        String[] array = l.toArray(new String[l.size()]);
        System.out.println("Printing Array: "+ Arrays.toString(array));
        System.out.println("Printing List: "+l);
    }
}
