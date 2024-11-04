package class1.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int productCount = scanner.nextInt();
        ProductOrder[] productOrders = new ProductOrder[productCount];

        for (int i = 0; i < productCount; i++) {
            //ProductOrder productOrder = new ProductOrder();
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.next();
            //productOrder.productName = scanner.next();
            System.out.print("가격: ");
            int productPrice = scanner.nextInt();
            //productOrder.price =  scanner.nextInt();
            System.out.print("수량: ");
            int productQuantity = scanner.nextInt();
            //productOrder.quantity = scanner.nextInt();

            //productOrders[i] = productOrder;
            productOrders[i] = createOrder(productName, productPrice, productQuantity);
        }
        printOrders(productOrders);
        int totalCost = getTotalAmount(productOrders);

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
