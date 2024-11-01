package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            int target = 4;
            int num = scanner.nextInt();
            arr[target - i] = num;
        }

        System.out.println("입력산 정수를 역순으로 출력:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        // 정답
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
