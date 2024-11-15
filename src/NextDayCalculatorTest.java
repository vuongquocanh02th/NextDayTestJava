import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
class NextDayCalculatorTest {
    @Test
    public void testGetNextDay() {
        LocalDate inputDate = LocalDate.of(2020, 1, 1);
        LocalDate nextDay = NextDayCalculator.getNextDay(inputDate);
        LocalDate expectedDate = LocalDate.of(2020, 1, 2);
        assertEquals(expectedDate, nextDay);
    }
}