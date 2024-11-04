package static2.ex;

public class Car {

    // 되도록 필드의 속성은 private 하도록
    private String modelName;
    private static int buyCount = 0;
    Car(String modelName) {
        this.modelName = modelName;
        System.out.println("차량 구입, 이름: " + modelName);
        buyCount++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + buyCount);
    }
}
