import java.util.Scanner;

public class GCDLCM {
    public static int gcd(int m, int n) {
        if (n!=0) {
            int r = m%n;
            m=n;
            n=r;
            return gcd(m, n);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int gcd = gcd(m, n);
        int lcm = (m*n)/gcd;
        System.out.println("GCD is: "+gcd);
        System.out.println("LCM is: "+lcm);
    }
}
