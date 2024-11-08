package string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        // 코드 작성
        for (String str : arr) {
            sum += str.length();
            System.out.println(str + ":" + str.length());
        }

        System.out.println();

        for (String str : arr) {
            int strLen = str.length();
            sum += strLen;
            System.out.println(str + ":" + strLen);
        }

        System.out.println("sum = " + sum);
    }
}
