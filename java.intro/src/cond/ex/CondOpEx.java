package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // (조건문) ? true일때 반환 : false일때 반환
        int bigger = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + bigger + "입니다.");
    }
}
