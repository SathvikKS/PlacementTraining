import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunishingThieves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Pattern a = Pattern.compile("[aA]"),
        e = Pattern.compile("[eE]"),
        i = Pattern.compile("[iI]"),
        o = Pattern.compile("[oO]"),
        u = Pattern.compile("[uU]");
        Pattern[] pts = {a,e,i,o,u};
        int mvc = -1;
        char mv = '\0';
        String maxName = "";
        String[] names = new String[n];
        for (int j=0; j<n; j++)
            names[j] = sc.nextLine();
        for (String name:   names) {
            for (Pattern p: pts) {
                char vowel = String.valueOf(p).charAt(1);
                int count=0;
                Matcher m = p.matcher(name);
                while (m.find())
                    count++;
                if (count>mvc) {
                    mvc = count;
                    mv = vowel;
                    maxName = name;
                }
            }
        }
        System.out.println(maxName+"\n"+ mv+" "+ mvc);
    }
}
