package string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        // code write
        int index = str.indexOf(ext);
        System.out.println(index);

        System.out.println("filename = " + str.substring(0, index));
        System.out.println("extName = " + str.substring(index));

    }
}
