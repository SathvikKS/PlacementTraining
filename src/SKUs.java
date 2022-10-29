import java.util.Scanner;

public class SKUs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] prS = sc.nextLine().split(" ");
        String[] diS = sc.nextLine().split(" ");;
        String[] skuS = sc.nextLine().split(" ");
        for (int i=0; i<n; i++) {
            if (Integer.parseInt(skuS[i])>0)
                System.out.print(Integer.parseInt(prS[i])*Integer.parseInt(diS[i])+" ");

        }
    }
}
