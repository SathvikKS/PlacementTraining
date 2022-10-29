import java.util.Scanner;

public class ThreeEnglishWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine(), s2= sc.nextLine(), s3= sc.nextLine();
        s1=s1.replaceAll("[aeiou]", "*");
        s2=s2.replaceAll("[^aeiou]", "@");
        s3=s3.toUpperCase();
        System.out.println(s1+s2+s3);
    }
}
/*
how
are
you
h*wa@eYOU
 */