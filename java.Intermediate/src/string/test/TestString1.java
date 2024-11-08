package string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        // 코드 작성
        System.out.println(url.startsWith("https://"));

        // 정답
        boolean result = url.startsWith("https://");
        System.out.println(result);
    }
}
