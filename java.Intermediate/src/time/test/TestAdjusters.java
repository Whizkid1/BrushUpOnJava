package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 코드 작성
//        LocalDate ld = LocalDate.now();
        LocalDate ld = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = ld.getDayOfWeek();
        DayOfWeek lastDayOfWeek = ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);

    }
}
