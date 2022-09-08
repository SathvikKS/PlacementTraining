import java.util.Arrays;
import java.util.Scanner;

public class ShiftZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index=0;
        for (int i=0; i<n; i++) {
            int temp = sc.nextInt();
            if (temp!=0)
                arr[index++] = temp;
        }
        System.out.println("Final array is: "+ Arrays.toString(arr));
    }
}
