import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        double n, root;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        root = Math.sqrt(n+1);
        if (root == (double) (int) root)
            System.out.println("Sunny Number");
        else
            System.out.println("Not a Sunny Number");
    }
}
