import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate getNextDay(LocalDate date) {
        return date.plusDays(1);
    }
}
