import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AirportRisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<n; i++)
            al.add(sc.nextInt());
        Collections.sort(al);
        for(int a: al)
            System.out.print(a+" ");
    }
}
