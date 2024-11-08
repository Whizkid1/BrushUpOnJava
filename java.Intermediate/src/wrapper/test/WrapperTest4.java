package wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        // 이 방식은 str -> int ->(autoboxing)-> Integer
//        Integer integer = Integer.parseInt(str);
        Integer integer = Integer.valueOf(str);
        System.out.println(integer);

        // Integer => int
        int num = integer.intValue();
        System.out.println(num);

        // int => Integer
        Integer integer1 = Integer.valueOf(num);
        System.out.println(integer1);

    }
}
