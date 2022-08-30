import java.util.*;

public class Dityan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String array = s.nextLine();
        String arr[] = array.split(" ");
        List<Integer> l1 = new
                ArrayList<Integer>();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
            l1.add(a[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (l1.contains(a[i] + a[j]))
                    continue;
                else
                    l1.add(a[i] + a[j]);
        }
        Collections.sort(l1);
        System.out.println(l1);
        int k = 1;
        for (Integer integer : l1) {
            if (k != integer)
                break;
            k++;
        }
        System.out.println(k);
    }
}