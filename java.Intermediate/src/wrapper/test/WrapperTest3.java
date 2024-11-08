package wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // Sting str을 Integer로 변환해서 출력해라.
        Integer integer = Integer.valueOf(str);

        // Integer를 int로 변환해서 출력해라. -> 오토 언박싱
        int num = integer;
//        int num = integer.intValue();

        // int를 Integer로 변환해서 출력해라.
        Integer integer1 = num;
//        Integer integer2 = Integer.valueOf(num);

        // Integer의 static method 의 반환이 무엇인지 궁금
//        Integer integer2 = Integer.sum(num, num);
//        int num2 = Integer.sum(num, num);
//        num.
//        System.out.println(integer.getClass());

        Integer integer2 = Integer.valueOf(str);
        System.out.println(integer2 == integer);
        System.out.println(integer2 == integer1);
        Integer integer3 = new Integer(str);
        System.out.println(integer2 == integer3);
    }
}
