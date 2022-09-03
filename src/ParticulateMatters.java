import java.util.Scanner;

public class ParticulateMatters {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int fine = 0;
        for (int car: arr) {
            if (isEven(d) && !isEven(car))
                fine+=x;
            if (!isEven(d) && isEven(car))
                fine+=x;
        }
        System.out.println(fine);
    }
}
