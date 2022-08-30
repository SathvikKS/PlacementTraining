import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = sc.nextLine().split(" ");
        int sum=0;
        for(String b: a)
            sum+=Integer.parseInt(b);
        if (sum%2==0 && sum%3==0 && sum%5==0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
