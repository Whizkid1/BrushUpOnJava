package wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 문자로 된 두 수의 합을 구하자.

        int sum = Integer.sum(Integer.parseInt(str1), Integer.parseInt(str2));
        System.out.println(sum);
    }
}
