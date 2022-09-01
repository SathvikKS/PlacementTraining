import java.util.Scanner;

public class SupermaketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price=1;
        while(n>0){
            int d = n%10;
            n/=10;
            price*=d;
        }
        System.out.println(price);
    }
}
