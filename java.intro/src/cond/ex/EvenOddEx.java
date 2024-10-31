package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 3;

        // 내 풀이
        int remainder = x % 2;
//        String answer = (x == 0) ? "짝수" : "홀수";
//        System.out.println("x = " + x + ", " + answer);

        // 정답지
        String answer = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + answer);
    }
}
