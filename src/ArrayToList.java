import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"JAVA", "Python", "PHP", "C++"};
        System.out.println("Printing array: "+Arrays.toString(array));
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Printing list: "+list);
    }
}
