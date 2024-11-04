package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private  int itemCount;

    public void addItem(Item item) {
        if (itemCount == 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        // 1차 시도 fail -> 미리 배열을 10개 만들어 놓기 때문에
//        for (Item item : items) {
//            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getPrice() * item.getQuantity());
//            totalPrice += item.getPrice() * item.getQuantity();
//        }
        // 2차시도 success -> 하지만 조금 개선이 필요함
//        for (int i = 0; i <= (itemCount - 1); i++) {
//            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getPrice() * items[i].getQuantity());
//            totalPrice += items[i].getPrice() * items[i].getQuantity();
//        }
        // 정답 1
        for (int i = 0; i <= (itemCount - 1); i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotalPrice());
            // 함수는 하나의 기능만 담당하는 것이 좋다고 한다. -> 이 기능도 함수 화 하는 것을 추천하는 것 같다.
            totalPrice += items[i].getTotalPrice();
        }

        // 정답 2
//        for (int i = 0; i <= (itemCount - 1); i++) {
//            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotalPrice());
//        }
//        totalPrice = calculateTotalPrice();
//
//        System.out.println("전체 가격 합:" + totalPrice);
//    }
//    private int calculateTotalPrice() {
//        int totalPrice = 0;
//        for (int i = 0; i < itemCount; i++) {
//            Item item = items[i];
//            totalPrice += item.getTotalPrice();
//        }
//        return totalPrice;
    }
}
