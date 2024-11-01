package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int studentCount = scanner.nextInt();

        int[][] arr = new int[studentCount][3];

        for(int i = 0; i < studentCount; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
            System.out.print("국어 점수: ");
            int koreanScore = scanner.nextInt();
            System.out.print("영어 점수: ");
            int englishScore = scanner.nextInt();
            System.out.print("수학 점수: ");
            int mathScore = scanner.nextInt();
            arr[i][0] = koreanScore;
            arr[i][1] = englishScore;
            arr[i][2] = mathScore;
        }

        for(int i = 0; i < studentCount; i++) {
            int totalScore = 0;
            double avergeScore = 0;
            for (int score : arr[i]) {
                totalScore += score;
            }
            avergeScore = (double) totalScore/3;
            System.out.println((i+1)+"번 학생의 총점: "+totalScore+", 평균: "+avergeScore);

        }
    }
}
