import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max=0;
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
    }
}
