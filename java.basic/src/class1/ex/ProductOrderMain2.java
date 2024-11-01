package class1.ex;

public class ProductOrderMain2 {
    // ProductOrderMain 의 refactoring
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
//        ProductOrder product1 = createOrder("두부", 2000, 2);
//        ProductOrder product2 = createOrder("김치", 5000, 1);
//        ProductOrder product3 = createOrder("콜라", 1500, 2);
//
//        orders[0] = product1;
//        orders[1] = product2;
//        orders[2] = product3;

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
//        int totalCost;
//        totalCost = getTotalAmount(orders);
        int totalCost = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalCost);

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalCost = 0;
        for (ProductOrder o : orders) {
            totalCost += o.price * o.quantity;
        }
        return totalCost;
    }
}
