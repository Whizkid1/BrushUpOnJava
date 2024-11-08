package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();

        for (AuthGrade authGrade : authGrades) {
            System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescription());
        }

        String grade = "LOGIN";
        AuthGrade authGrade = AuthGrade.valueOf(grade); // string과 일치하는 객체를 반환
        System.out.println(authGrade); // 자동 toString()
        System.out.println(authGrade.getLevel());
    }
}
