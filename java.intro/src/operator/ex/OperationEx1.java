package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        // 파이썬과 사뭇 다른 다중 변수 선언
        // bad initialized
        //int num1, int num2, int num3 = 10, 20, 30;
        //int num1, num2, num3 = 10, 20, 30;

        // good initialized
        int num1 = 10, num2 = 20, num3 = 30;
        
        //int num1 = 10;
        //int num2 = 20;
        //int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum/3;

        System.out.println(sum);
        System.out.println(average);
    }
}
