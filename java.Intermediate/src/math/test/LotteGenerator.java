package math.test;

import java.util.Random;

public class LotteGenerator {

    public static void main(String[] args) {
        Random random = new Random();

//        int num1 = (int) (Math.random() * 45) + 1;
//        int num1 = random.nextInt(45) + 1;
//        int num1 = random.nextInt(3, 5); // 3~4 의 숫자가 반환
//        int num1 = random.nextInt(1, 46); // 1~45의 숫자가 반환
//        System.out.println(num1);

        int[] lotteArr = new int[6];
        int count = 0;
        boolean unique = true;
        while (count < 6) {
            int num = random.nextInt(1, 46);
//            for (int lotteNum : lotteArr) {
//                if (lotteNum == num) {
//                    continue;
//                }
//            }
            // fail -> 숫자가 중복으로 들어감.. 반복문 제어문을 잘못 사용하고 있음
            // 정답지가 맞는 방향이였음
//            for (int i =0 ; i < count ; i++) {
//                if (lotteArr[i] == num) {
//                    continue;
//                }
//            }
//
//            lotteArr[count] = num;
//            count++;

            for (int i = 0; i < count; i++) {
                if (lotteArr[i] == num) {
                    unique = false;
                    break;
                }
                unique = true;
            }

            if (unique) {
                lotteArr[count] = num;
                count++;
            }

        }

        for (int lotteNum : lotteArr) {
            System.out.print(lotteNum + " ");
        }
    }
}
