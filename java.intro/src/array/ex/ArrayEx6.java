package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 사용하지 않는 방법
//        System.out.print("입력받을 숫자의 개수를 입력하세요:");
//        int inputNum = scanner.nextInt();
//        int maxNum = 0;
//        int minNum = 0;
//
//        System.out.println(inputNum + "개의 정수 입력하세요:");
//        for (int i = 0; i < inputNum; i++) {
//            int num = scanner.nextInt();
//            if (i == 0) {
//                minNum = num;
//                maxNum = num;
//                continue;
//            }
//            if (num > maxNum) {
//                maxNum = num;
//            } else if (num < minNum) {
//                minNum = num;
//            }
//        }
//        System.out.println("가장 작은 정수: " + minNum);
//        System.out.println("가장 큰 정수: " + maxNum);
        
        // 배열 사용
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputNum = scanner.nextInt();
        int[] arr = new int[inputNum];

        System.out.println(inputNum + "개의 정수 입력하세요:");
        for (int i = 0; i < inputNum; i++) {
            arr[i] = scanner.nextInt();
        }

        int minNum, maxNum;
        minNum = maxNum = arr[0];
        for (int i = 1; i < inputNum; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            } else if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
