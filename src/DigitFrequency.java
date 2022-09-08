import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        int[] hist = new int[10];
        while (n >0) {
            int d = (int)n%10;
            n/=10;
            hist[d]++;
        }
        for (int i = 0; i<10; i++)
            if (hist[i] != 0)
                System.out.println(i+" --> "+ hist[i]);
    }
}
