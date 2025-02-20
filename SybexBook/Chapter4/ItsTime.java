import java.time.*;

public class ItsTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());  // just the date
        System.out.println(LocalTime.now());  // just the time
        System.out.println(LocalDateTime.now());  // both
        System.out.println(ZonedDateTime.now());  // both
    }
}