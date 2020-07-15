//package nextdaycalculator;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class NextDayCalculatorTest {
//    @Test
//    void testNextDay1() {
//        int day = 1;
//        int month = 5;
//        int year = 2018;
//
//        int resultDay = NextDayCalculator.checkDay(day);
//        assertEquals(resultDay, 2);
//        int resultMonth = NextDayCalculator.checkMonth(month, day);
//        assertEquals(resultMonth, 1);
//        int resultYear = NextDayCalculator.checkYear(year, month, day);
//        assertEquals(resultYear, 2018);
//    }
//
//    @Test
//    void testNextDay2() {
//        int day = 31;
//        int month = 1;
//        int year = 2018;
//
//        int resultDay = NextDayCalculator.checkDay(day);
//        assertEquals(resultDay, 1);
//        int resultMonth = NextDayCalculator.checkMonth(month, day);
//        assertEquals(resultMonth, 2);
//        int resultYear = NextDayCalculator.checkYear(year, month, day);
//        assertEquals(resultYear, 2018);
//    }
//}
