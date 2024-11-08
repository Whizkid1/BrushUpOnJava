package string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";

        // code writing
        String substring1 = str.substring(0, 5);
        String substring2 = str.substring(5);
        // String substring2 = str.substring(5, 9);

        System.out.println("filename = " + substring1);
        System.out.println("extName = " + substring2);
        System.out.println(str);

        // 자바는 dot으로 나누기 위해서 "\\." 으로 해야한다
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        // Splits this string around matches of the given regular expression.
        // https://its-easy.tistory.com/11
        // 정규식에서는 []안에 있거나 \\다음에 오는 문자만 특수문자로 취급
//        String[] arr = str.split(".");
        String[] arr = str.split("\\.");
        System.out.println("filename = " + arr[0]);
        System.out.println("extName = " + "." + arr[1]);
    }
}
