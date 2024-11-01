package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            //System.out.println(num);
            arr[i] = num;
        }

        System.out.println("출력");
        for (int i = 0; i < arr.length; i++) {
            if (i < 4) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }

        }
        // 정답
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length -1) {
                System.out.print(", ");
            }
        }
    }
}
