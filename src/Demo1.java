import java.util.Arrays;

public class Demo1 {
    public static int sq(int n) {
        int s=0;
        while (n>0) {
            int d = n%10;
            s+=(d*d);
            n=(int)n/10;
        }
        return s;
    }
    public int[] happy(int input1, int[] input2) {
        int[] ans = new int[input1];
        int index=0;
        for (int i=0; i<input1; i++) {
            int temp = input2[i];
            while  (temp>10) {
                temp=sq(temp);
            }
            if (temp==1)
                ans[index++] = 1;
            else
                ans[index++] = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        int[] a = {11, 19};
        System.out.println(Arrays.toString(d.happy(2, a)));
    }
}
