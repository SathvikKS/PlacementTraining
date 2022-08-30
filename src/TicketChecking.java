import java.util.Scanner;

public class TicketChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] t = sc.nextLine().split(" ");
        int d = sc.nextInt();
        for (String a: t) {
            if (Integer.parseInt(a) % d == 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}
