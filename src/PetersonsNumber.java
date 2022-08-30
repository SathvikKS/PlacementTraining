import java.util.Scanner;

public class PetersonsNumber {
    public static int calc(int num) {
        if (num==0)
            return 1;
        else {
            return num*calc(--num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum=0;
        int num=sc.nextInt();
        int copy = num;
        sum=calc(num);
        while(num>0) {
            int d = num%10;
            int fact=calc(d);
            sum+=fact;
            num/=10;
        }
        if (copy==sum)
            System.out.println("Peterson Number");
        else
            System.out.println("Not a Peterson Number");
    }
}
