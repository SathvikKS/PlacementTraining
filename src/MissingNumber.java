import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2, s = 0;
        for (int i = 0; i<n-1; i++)
            s+=sc.nextInt();
        System.out.println(sum-s);
    }
}
