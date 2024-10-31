package cond.ex;

public class ExchangeRateEX {
    public static void main(String[] args) {
        int dollar = 100;

        System.out.println("dollar: " + dollar);

        if (dollar < 0) {
            System.out.println("출력: 잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("출력: 환전할 금액이 없습니다.");
        } else {
            //환율을 1300원으로 설정
            int exchange = dollar * 1300;
            System.out.println("출력: 환전 금액은 " + exchange + "원입니다.");
        }
    }
}
