package immutable.test;

public class ImmutableMyDate {

//    private int year;
//    private int month;
//    private int day;
    // 불변이기 때문에 final 설정을 해줘야함.
    private final int year;
    private final int month;
    private final int day;
    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public ImmutableMyDate setYear(int year) {
//        ImmutableMyDate immutableMyDate = new ImmutableMyDate(year, this.month, this.day);
//        return immutableMyDate;
//    }
    // refactoring
    // 불변객체 변경의 경우 함수에 withOOO() 을 대부분 작성
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, this.month, this.day);
    }
//    public ImmutableMyDate withYear(int newYear) {
//        return new ImmutableMyDate(newYear, month, day);
//    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
