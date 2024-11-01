package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        productOrders[0] = dubu;
        productOrders[1] = kimchi;
        productOrders[2] = cola;

        //ProductOrder[] productOrders = {dubu, kimchi, cola};

        // 상품 주문 정보와 최종 금액 출력
        int totalCost = 0;
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            totalCost += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + totalCost);

    }
}
