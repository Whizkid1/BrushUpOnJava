package static2.ex;

public class MathArrayUtils {

    // MathArrayUtils 클래스 인스턴스를 만들지 않고 사용하게 작성
    // 또한 인스턴스를 생성하지 못하도록 막아야 함
    private MathArrayUtils() {

    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int value: arr) {
            result+= value;
        }
        return result;
    }

    public static double average(int[] arr) {
        int result = 0;
        result = sum(arr);
        return (double) result / arr.length;
        // 정답
        //return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int minValue = 0;
        // 정답
        //int minValue = arr[0];
        for (int value : arr) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] arr) {
        int maxValue = 0;
        // 정답
        //int maxValue = arr[0];
        for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

}
