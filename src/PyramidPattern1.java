/*
        *
       ***
      *****
     *******
*/
import java.util.Scanner;

public class PyramidPattern1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i=0; i<n;) {
            for (int space = n-i-1; space>0; space--)
                System.out.print(" ");
            for (int j=0; j<i+++i; j++,--i)
                System.out.print("*");
            System.out.println();
        }
    }
}
