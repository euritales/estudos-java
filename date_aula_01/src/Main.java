import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter format01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T22:32:21");
        Instant d06 = Instant.parse("2022-07-20T22:32:00Z");
        Instant d07 = Instant.parse("2022-07-20T22:32:00-03:00");
        LocalDate d08 = LocalDate.parse("13/07/2022", format01);
        LocalDateTime d09 = LocalDateTime.parse("13/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDate d10 = LocalDate.of(2022, 10,10);
        LocalDateTime d11 = LocalDateTime.of(2022, 10,10, 14, 32,23);


        System.out.println("d01: " + d01.toString());
        System.out.println("d02: " + d02.toString());
        System.out.println("d03: " + d03.toString());
        System.out.println("d04: " + d04.toString());
        System.out.println("d05: " + d05.toString());
        System.out.println("d06: " + d06.toString());
        System.out.println("d07: " + d07.toString());
        System.out.println("d08: " + d08.toString());
        System.out.println("d09: " + d09.toString());
        System.out.println("d10: " + d10.toString());
        System.out.println("d11: " + d11.toString());
    }
}