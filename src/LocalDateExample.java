import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate y = d.minusDays(1);
        LocalDate t = d.plusDays(1);
        System.out.println("Today "+d);
        System.out.println("Yesterday: "+y);
        System.out.println("Tomorrow: "+t);
    }
}
