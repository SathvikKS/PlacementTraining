/*

 */
import java.util.Scanner;

public class PyramidPattern2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i=1; i<=n; i++) {
            for (int space = n-i; space>0; space--)
                System.out.print(" ");
            if (i==1) {
                System.out.println(i);
                continue;
            }
            int t = 0;
            for (int j=i, nos = i-1, c=0; c<nos; j--, c++) {
                System.out.print(j);
                t+=j;
            }
            System.out.print(t);
            for (int j=i, nos = i-1, c=0; c<nos; j--, c++) {
                System.out.print(j);
                t+=j;
            }
            System.out.println();
        }
    }
}