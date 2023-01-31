import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T22:32:21");
        Instant d06 = Instant.parse("2022-07-20T22:32:00Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("--- --- --- --- --- --- --- --- ---");
        System.out.println("fmt01: " + d04.format(fmt01));
        System.out.println("fmt02: " + d05.format(fmt02));
        System.out.println("fmt02: " + d05.format(fmt04));
        System.out.println("fmt03: " + fmt03.format(d06 ));
        System.out.println("fmt03: " + fmt05.format(d06 ));
    }
}