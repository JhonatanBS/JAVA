import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate firstDate = LocalDate.now();
        LocalDateTime secondDate = LocalDateTime.now();
        Instant thirdDate = Instant.now();

        LocalDate fourDate = LocalDate.parse("2021-05-20");
        LocalDateTime fiveDate = LocalDateTime.parse("2021-05-20T05:20:55");
        Instant sixDate = Instant.parse("2022-10-05T05:35:40Z");

        LocalDate sevenDateTime = LocalDate.parse("25/12/2026", dateTimeBrazil);

        System.out.println(firstDate);
        System.out.println(secondDate);
        System.out.println(thirdDate);
        System.out.println(fourDate);
        System.out.println(fiveDate);
        System.out.println(sixDate);
        System.out.println(sevenDateTime);
    }
}