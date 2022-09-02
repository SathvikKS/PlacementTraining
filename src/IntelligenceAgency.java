import java.util.Scanner;

public class IntelligenceAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sum=0;
        if (r == 0) {
            System.out.println(0);
            return;
        }
        while(n>0) {
            int d = n%10;
            sum+=d;
            n/=10;
        }
        int finalsum=0;
        for(;r>0;r--)
            finalsum+=sum;
        if (finalsum<10)
            System.out.println(finalsum);
        else {
            sum=0;
            while(finalsum>10) {
                while(finalsum>0) {
                    int d = finalsum%10;
                    sum+=d;
                    finalsum/=10;
                }
                finalsum=sum;
            }

            System.out.println(sum);
        }


    }
}
