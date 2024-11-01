package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {


        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));

        //https://www.inflearn.com/community/questions/25520/%EC%99%9C-main-%ED%95%A8%EC%88%98-%EC%95%88%EC%97%90%EC%84%9C-%ED%95%A8%EC%88%98%EB%A5%BC-%EC%A0%95%EC%9D%98%ED%95%98%EB%A9%B4-%EC%98%A4%EB%A5%98%EA%B0%80-%EB%82%98%EB%8A%94-%EA%B1%B4%EA%B0%80%EC%9A%94?srsltid=AfmBOoqRi2Tzi88aYqdP2wXGnD35qFVCrgYqN5BaCHSFQX5RPYfi5do8
        // main도 함수라 중첩함수가 안된다고 한다.
//        public  double average(int num1, int num2, int num3) {
//            int sum = num1 + num2 + num3;
//            double result = sum/ 3.0;
//            return result;
//        }
    }
    public static double average(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
//        double result = sum/ 3.0;
//        return result;
        return sum/3.0;
    }
}
