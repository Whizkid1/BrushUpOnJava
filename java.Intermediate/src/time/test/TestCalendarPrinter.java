package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월를 입력하세요: ");
        int month = scanner.nextInt();

        LocalDate startDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = startDate.getDayOfWeek();
        int firstDayOfWeekValue = firstDayOfWeek.getValue();
        System.out.println(firstDayOfWeekValue);
        LocalDate lastDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(ChronoUnit.DAYS.between(startDate, lastDate));
//        System.out.println(startDate);
//        System.out.println(lastDate);
//        int betweenWeek = startDate.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
//        int betweenWeek2 = lastDate.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
//        System.out.println(betweenWeek);
//        System.out.println(betweenWeek2);


    }
}
