package nextdaycalculator;

import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

import java.util.Scanner;

public class NextDayCalculator {

    public static int day, month, year;
    public static int lateDay, lateMonth, lateYear;

    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = NextDayCalculator.year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = NextDayCalculator.year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = NextDayCalculator.year % 400 == 0;
                if (isDivisibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int checkYear(int year, int month, int day) {
        if (month == 12 && day == 31) {
            lateYear = year + 1;
        } else {
            lateYear = year;
        }
        return lateYear;
    }

    public static int checkDay(int day) {
        if (day == getDaysOfMonth()) {
            lateDay = 1;
        } else {
            lateDay = day + 1;
        }
        return lateDay;
    }

    public static int checkMonth(int month, int day) {
        if (month == 12) {
            lateMonth = 1;
        } else if (day == getDaysOfMonth()) {
            lateMonth = month + 1;
        } else {
            lateMonth = month;
        }
        return lateMonth;
    }

    private static int getDaysOfMonth() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                boolean isLeapYear = isLeapYear(year);
                if (isLeapYear) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ngày:");
        day = sc.nextInt();
        System.out.println("Tháng:");
        month = sc.nextInt();
        System.out.println("Năm:");
        year = sc.nextInt();

        System.out.println(checkDay(day) + "/"
                + checkMonth(month, day) + "/"
                + checkYear(year, month, day));
    }

}
