package string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성
        String[] fruitArr = fruits.split(",");
        for (String fruit : fruitArr) {
            System.out.println(fruit);
        }

//        String joinedString = fruits.join(",", "->"); // 결과 "->" fail....
        // 이렇게 해도 된다... 아마 fruits 가 String 객체여서 되는 것 같은데
        String joinedString = fruits.join("->", fruitArr);
        System.out.println(joinedString);

        String joinedString2 = String.join("->", fruitArr);
        System.out.println(joinedString2);
    }
}
