import java.util.Scanner;

public class GreatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nc = n;
        int sum=0, prod=1;
        while(n>0) {
            int d = n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        if ((prod+sum == nc))
            System.out.println("Great");
        else
            System.out.println(nc);
    }
}
