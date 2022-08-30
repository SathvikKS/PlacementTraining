import java.util.Scanner;

public class Sundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int n = sc.nextInt();
        int day = 0;
        if (s.contains("sun"))
            day=7;
        else if (s.contains("mon"))
            day=1;
        else if (s.contains("tue"))
            day=2;
        else if (s.contains("wed"))
            day=3;
        else if (s.contains("thu"))
            day=4;
        else if (s.contains("fri"))
            day=5;
        else if (s.contains("sat"))
            day=6;
        int daysToFirstSunday = 7-day;
        int sundays = 0;
        for(int i=n+1-daysToFirstSunday; i>0; i-=7) {
            sundays++;
        }
        System.out.println(sundays);
    }
}
