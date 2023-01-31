import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T22:32:21");
        Instant d06 = Instant.parse("2022-07-20T01:32:00Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        Duration duracao01 = Duration.between(pastWeekInstant, nextWeekInstant);
        Duration duracao02 = Duration.between(pastWeekLocalDate.atStartOfDay(), d05);
        Duration duracao03 = Duration.between(d06, pastWeekInstant);

        System.out.println("Semana passada d04: " + pastWeekLocalDate);
        System.out.println("Semana atual d04: " + d04);
        System.out.println("Semana seguinte: d04: " + nextWeekLocalDate);

        System.out.println("--- --- --- --- --- --- --- --- ");

        System.out.println("Semana passada d06: " + pastWeekInstant);
        System.out.println("Semana atual d06: " + d06);
        System.out.println("Semana seguinte: d06: " + nextWeekInstant);

        System.out.println("Tempo de duracao: " + duracao01.toDays());
        System.out.println("Tempo de duracao: " + duracao02.toDays());
        System.out.println("Tempo de duracao: " + duracao03.toDays());

    }
}