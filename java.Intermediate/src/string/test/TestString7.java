package string.test;

import java.util.Arrays;

public class TestString7 {
    public static void main(String[] args) {
        String original = "     hello java     ";

        // 코드 작성
        String result = original.trim();
        System.out.println(result);

        // 실패
//        String[] result2 = original.split(" ");
////        for (String str : result2) {
////            System.out.println(str);
////        }
//        result2 = Arrays.stream(result2).filter(item -> !item.equals(" ")).toArray(String[]::new);
//        System.out.println(Arrays.toString(result2));


    }
}
