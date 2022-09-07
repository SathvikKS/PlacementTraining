import java.util.Scanner;

public class AmstrongNo {
    public static boolean checkAmstrong(int n) {
        int copy = n;
        int sum=0;
        int len = String.valueOf(n).length();
        while (n>0) {
            int d = n%10;
            sum += Math.pow(d, len);
            n/=10;
        }
        return sum == copy;
    }
    public static void genAmstrongNo(int n) {
        int count = 1, num = 9;
        while (count<=n) {
            if (checkAmstrong(++num)) {
                System.out.print(num + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        genAmstrongNo(new Scanner(System.in).nextInt());
    }
}
