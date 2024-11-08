package string.test;

public class TestString3 {

    public static void main(String[] args) {
        String str = "hello.txt";

        // 코드 작성
        System.out.println("index = " + str.indexOf(".txt"));

        // 정답지
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);
    }
}
