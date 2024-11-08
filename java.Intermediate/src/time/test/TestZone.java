package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        // ZonedDateTime 다른 방식
//        ZonedDateTime.of(LocalDate.of(2024, 1,1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdtSeoul = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdtLondon = zdtSeoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zdtNewYork = zdtSeoul.withZoneSameInstant(ZoneId.of("America/New_York"));



        System.out.println("서울의 회의 시간: " + zdtSeoul);
        System.out.println("런던의 회의 시간: " + zdtLondon);
        System.out.println("뉴욕의 회의 시간: " + zdtNewYork);

    }
}
