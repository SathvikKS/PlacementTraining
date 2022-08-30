import java.util.ArrayList;
import java.util.Scanner;

public class CombineSeries {
    static ArrayList<Integer> primeNos = new ArrayList<>();
    static ArrayList<Integer> fiboNos = new ArrayList<>();
    static int primeIndex = 0, fiboIndex=0;
    static public boolean checkPrime(int n) {
        for (int i=2; i<=n/2; i++)
            if (n%i==0)
                return false;
        return true;
    }
    static public void genPrime(int n) {
        int count=0, num=1;
        while (count < n) {
            if (checkPrime(++num)) {
                count++;
                primeNos.add(num);
            }
        }
    }
    static public void genFibo(int n, int n1, int n2, int count) {
        if (count>=n)
            return;
        fiboNos.add(n1);
        genFibo(n, n2, n1+n2, ++count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        genPrime(n/2);
        genFibo(n-n/2, 1, 1, 0);
        for (int i=0; i<n; i++) {
            if (i==n-1) {
                if (i%2 == 0)
                    System.out.print(primeNos.get(primeIndex)+" ");
                else
                    System.out.print(fiboNos.get(fiboIndex)+" ");
            }
            if (i%2 == 0)
                primeIndex++;
            else
                fiboIndex++;
        }
    }
}
