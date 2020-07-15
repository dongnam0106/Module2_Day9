package nextdaycalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    public void testNextDay1() {
        int day = 1;
        int month = 5;
        int year = 2018;
        NextDay nextDay = new NextDay(day, month, year);

        int resultDay = nextDay.checkDay();
        assertEquals(2, resultDay);
        int resultMonth = nextDay.checkMonth();
        assertEquals(month, resultMonth);
        int resultYear = nextDay.checkYear();
        assertEquals(year, resultYear);
    }

    @Test
    public void testNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        NextDay nextDay = new NextDay(day, month, year);

        int resultDay = nextDay.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDay.checkMonth();
        assertEquals(2, resultMonth);
        int resultYear = nextDay.checkYear();
        assertEquals(year, resultYear);
    }

    @Test
    public void testNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        NextDay nextDay = new NextDay(day, month, year);

        int resultDay = nextDay.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDay.checkMonth();
        assertEquals(5, resultMonth);
        int resultYear = nextDay.checkYear();
        assertEquals(year, resultYear);
    }
    @Test
    public void testNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        NextDay nextDay = new NextDay(day, month, year);

        int resultDay = nextDay.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDay.checkMonth();
        assertEquals(3, resultMonth);
        int resultYear = nextDay.checkYear();
        assertEquals(year, resultYear);
    }
    @Test
    public void testNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        NextDay nextDay = new NextDay(day, month, year);

        int resultDay = nextDay.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDay.checkMonth();
        assertEquals(3, resultMonth);
        int resultYear = nextDay.checkYear();
        assertEquals(year, resultYear);
    }
    @Test
    public void testNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        NextDay nextDay = new NextDay(day, month, year);

        int resultDay = nextDay.checkDay();
        assertEquals(1, resultDay);
        int resultMonth = nextDay.checkMonth();
        assertEquals(1, resultMonth);
        int resultYear = nextDay.checkYear();
        assertEquals(2019, resultYear);
    }
}
