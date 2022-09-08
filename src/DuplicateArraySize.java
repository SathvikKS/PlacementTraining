import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        for (int i=0; i<n; i++)
            if (Arrays.binarySearch(arr, arr[i]) == i)
                l++;
        System.out.println(l);
    }
}
