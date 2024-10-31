package loop.ex;

public class LoopEx3 {
    public static void main(String[] args) {
        int max = 3;
        int sum = 0;
        
        // while 문
//        int i = 1;
//        while (i <= max) {
//            sum += i;
//            i++;
//        }
        
        // for 문
        for (int i = 1; i <= max; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
