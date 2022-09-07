import java.util.Scanner;


public class PrimeNo {
    public static boolean checkPrime(int n) {
        for (int i=2; i<=Math.sqrt(n); i++)
            if (n%i == 0)
                return false;
        return true;
    }
    static public void genPrime(int n) {
        int count=0, num=1;
        while (count < n) {
            if (checkPrime(++num)) {
                count++;
                System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args) {
        genPrime(new Scanner(System.in).nextInt());
    }
}
