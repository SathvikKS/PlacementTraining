import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++)
            arr.add(sc.nextInt());
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-2));
    }
}
