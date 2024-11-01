package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputNum = scanner.nextInt();

        // 배열 안 사용
        int sum = 0;
        System.out.println(inputNum + "개의 정수 입력하세요:");
        for (int i = 0; i < inputNum; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        double average = (double) sum / inputNum;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

        // 배열 사용
//        int[] arr = new int[inputNum];
//
//        System.out.println(inputNum + "개의 정수 입력하세요:");
//        for (int i = 0; i < inputNum; i++) {
//            int num = scanner.nextInt();
//            arr[i] = num;
//        }
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        System.out.println("입력한 정수의 합계: " + sum);
//
//        double average = (double) sum / 5;
//        System.out.println("입력한 정수의 평균: " + average);

    }
}
