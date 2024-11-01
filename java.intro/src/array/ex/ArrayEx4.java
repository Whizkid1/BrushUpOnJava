package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("입력한 정수의 합계: " + sum);

        double average = (double) sum / 5;
        System.out.println("입력한 정수의 평균: " + average);
    }
}
