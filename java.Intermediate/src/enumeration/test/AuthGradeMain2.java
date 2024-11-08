package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
            String grade = scanner.next();
            
//            AuthGrade authGrade = AuthGrade.valueOf(grade);
            // 정답지
            AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());

            // refactoring -> 공통 부분 추출
            System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
            System.out.println("==메뉴 목록==");

//            switch (authGrade) {
//                case AuthGrade.GUEST:
////                    System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
////                    System.out.println("==메뉴 목록==");
//                    System.out.println("- 메인 화면");
//                    break;
//                case AuthGrade.LOGIN:
////                    System.out.println("당신의 등급은 " + authGrade.getDescription()+ "입니다.");
////                    System.out.println("==메뉴 목록==");
//                    System.out.println("- 메인 화면");
//                    System.out.println("- 이메일 관리 화면");
//                    break;
//                case AuthGrade.ADMIN:
////                    System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
////                    System.out.println("==메뉴 목록==");
//                    System.out.println("- 메인 화면");
//                    System.out.println("- 이메일 관리 화면");
//                    System.out.println("- 관리자 화면");
//                    break;
//            }

            if (authGrade.getLevel() > 0) {
                System.out.println("- 메인 화면");
            // else if 는 안된다
//            } else if (authGrade.getLevel() > 1) {
//                System.out.println("- 이메일 관리 화면");
//            }
            }
            if (authGrade.getLevel() > 1) {
                System.out.println("- 이메일 관리 화면");
            }
            if (authGrade.getLevel() > 2) {
                System.out.println("- 관리자 화면");
            }
        }
    }
}
