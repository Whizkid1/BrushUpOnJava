package string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "hello java";

        // 코드 작성
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str).reverse();
        String result = strBuilder.toString();

        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println(result);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.reverse().toString());
    }
}
