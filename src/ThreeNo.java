import java.util.Scanner;

public class ThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] n1 = sc.nextLine().split(" ");
        if (n<Integer.parseInt(n1[1]) && n>Integer.parseInt(n1[0]))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
