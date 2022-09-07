/*
sathvik
 sathvi
  sathv
   sath
    sat
     sa
      s*/
import java.util.*;

class NamePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = name.length();
        System.out.println();
        for (int i=0; i<n; i++) {
            for (int space=0; space<i; space++)
                System.out.print(" ");
            System.out.print(name.substring(0, n-i));
            System.out.println();
        }
        sc.close();
    }
}