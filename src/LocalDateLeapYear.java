import java.time.LocalDate;

public class LocalDateLeapYear {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2017, 1, 13);
        System.out.println(d.isLeapYear());
    }
}
