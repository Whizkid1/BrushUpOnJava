package enumeration.test;

public class ClassGradeTest {
    public static void main(String[] args) {
        ClassGrade classGrade = new ClassGrade();
        ClassGrade classGrade2 = new ClassGrade();

        System.out.println(classGrade);
        System.out.println(classGrade.GOLD);
        System.out.println(classGrade.GOLD.getClass());
        System.out.println(classGrade.GOLD.GOLD);
        System.out.println(classGrade.GOLD.GOLD.GOLD);
        System.out.println(classGrade.GOLD.GOLD.GOLD.GOLD);
        System.out.println(classGrade.GOLD.GOLD.GOLD.GOLD.GOLD);
        System.out.println("----------------------------------");
        System.out.println(classGrade.BASIC);
        System.out.println("----------------------------------");
        System.out.println(ClassGrade.GOLD);
        System.out.println("----------------------------------");
        System.out.println(classGrade2.GOLD);
        System.out.println("----------------------------------");
//        System.out.println(ClassGrade.TTT.TTT); // ..... ???

    }
}
