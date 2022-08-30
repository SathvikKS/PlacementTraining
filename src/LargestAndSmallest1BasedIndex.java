import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestAndSmallest1BasedIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minI = -1, maxI = -1;
        sc.nextLine();
        String[] in = sc.nextLine().split(" ");
        for (int i=0;i<in.length; i++) {
            int t = Integer.parseInt(in[i]);
            if (t>max) {
                max = t;
                maxI = i;
            }
            if (t<min) {
                min = t;
                minI = i;
            }
        }
        System.out.println((minI+1)+" "+(maxI+1));
    }
}
