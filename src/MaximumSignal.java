import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);int n = sc.nextInt();
        String s = sc.next();
        int max1 = 0, max0 = 0, max = 0;
        String ns = s.replace("0", " ");
        String[] no0 = s.split("0");
        for (String sub : no0) {
            if (sub.length()>0) {
                Pattern p = Pattern.compile("^.+\\b"+sub+"\\b.+$");
                Matcher m = p.matcher(ns);
                if (m.find())
                    max1 = Math.max(sub.length(), max1);
            }
        }
        ns = s.replace("1", " ");
        String[] no1 = s.split("0");
        for (String sub : no1) {
            if (sub.length()>0) {
                Pattern p = Pattern.compile("^.+\\b"+sub+"\\b.+$");
                Matcher m = p.matcher(ns);
                if (m.find())
                    max0 = Math.max(sub.length(), max0);
            }
        }
        System.out.println(Math.max(max0, max1));
    }
}
/*
6
101000
1

9
101111110
6
 */