import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("apple", "mango", "banana", "watermelon");
        //Before JAVA 8
        List<String> uc = new ArrayList<>();
        for (String fruit: l) {
            uc.add(fruit.toUpperCase());
        }
        System.out.println(uc);
        //After JAVA 8
        l.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
        System.out.println("result: "+result);
    }
}
