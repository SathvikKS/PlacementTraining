import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxFreq = -1, maxNumber = -1;
        int n = sc.nextInt();
        sc.nextLine();
        String[] in = sc.nextLine().split(" ");
        HashMap<String, Integer> counter = new HashMap<>();
        for (String a: in) {
            if (counter.containsKey(a))
                counter.replace(a, counter.get(a) + 1);
            else
                counter.put(a, 1);
        }
        for (Map.Entry<String, Integer> entry: counter.entrySet()) {
            if (entry.getValue()>maxFreq) {
                maxFreq = entry.getValue();
                maxNumber = Integer.parseInt(entry.getKey());
            }
        }
        System.out.println(maxNumber);
    }
}
