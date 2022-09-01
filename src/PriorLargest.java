import java.util.Scanner;

public class PriorLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(a[i]);
        int large = 0;
        for (int i=0; i<n; i++) {
            int flag=1;
            for (int j=0; j<i; j++)
                if (arr[j] >= arr[i]) {
                    flag = 0;
                    break;
                }
            if (flag == 1)
                large++;
        }
        System.out.println(large);
    }
}
