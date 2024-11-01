package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
    String message = "Hello, Wordl!!";
    callMessage(3, message);
    callMessage(5, message);
    callMessage(7, message);
    }
    public static void callMessage(int num, String message) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}
