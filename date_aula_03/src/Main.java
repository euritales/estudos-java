import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T22:32:21");
        Instant d06 = Instant.parse("2022-07-20T01:32:00Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
        System.out.println("R3: " + r3);
        System.out.println("R4: " + r4);

        System.out.println("d04: " + d04.getDayOfMonth());
        System.out.println("d04: " + d04.getMonthValue());
        System.out.println("d04: " + d04.getDayOfWeek());

    }
}