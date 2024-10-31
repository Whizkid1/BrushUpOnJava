package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {

        // while
        // 내 풀이
//        int num = 1;
//        int count = 1;
//        while (count <= 10) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//                count++;
//
//           }
//            num++;
//        }
        // 정답
//        int num = 2;
//        int count = 1;
//        while (count <= 10) {
//            System.out.println(num);
//            num += 2;
//            count++;
//        }
        // for 문
//        for (int num=1, count=1; count <= 10; num++) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//                count++;
//            }
        // bad code
//        for (int num=1, count=1; count <= 10; ((num % 2) == 1) ? num++ : num++, count++) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//                count++;
//            }
        // 정답
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
