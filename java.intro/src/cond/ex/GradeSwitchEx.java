package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "C";

        System.out.println("grade: " + '"' + grade + '"');
//        switch (grade) {
//            case "A" -> System.out.println("출력: 탁월한 성과입니다!");
//            case "B" -> System.out.println("출력: 좋은 성과입니다!");
//            case "C" -> System.out.println("출력: 준수한 성과입니다!");
//            case "D" -> System.out.println("출력: 향상이 필요합니다!");
//            case "F" -> System.out.println("출력: 불합격입니다!");
//            default -> System.out.println("출력: 잘못된 학점입니다!");
//        }

        switch (grade) {
            case "A":
                System.out.println("출력: 탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("출력: 좋은 성과입니다!");
                break;
            case "C":
                System.out.println("출력: 준수한 성과입니다!");
                break;
            case "D":
                System.out.println("출력: 향상이 필요합니다!");
                break;
            case "F":
                System.out.println("출력: 불합격입니다!");
                break;
            default:
                System.out.println("출력: 잘못된 학점입니다!");
        }
    }
}
