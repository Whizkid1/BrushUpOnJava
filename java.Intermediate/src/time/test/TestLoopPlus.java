package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 1, 1);

//        for (int i = 1; i < 6; i++) {
//            System.out.println("날짜 " + i + ": " + ld);
//            ld = ld.plusWeeks(2);
//        }

        // 정답
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS); //ChronoUnit은 열거형!!!!
            System.out.println("날짜 " + (i+1) + ": " + nextDate);
        }
//        ld.get()
    }
}
