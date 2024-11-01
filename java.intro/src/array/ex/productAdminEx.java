package array.ex;

import java.util.Scanner;

public class productAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int optionNum = scanner.nextInt();
            scanner.nextLine();

            if (optionNum == 1) {
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                String productName = scanner.next();
                System.out.print("상품 가격을 입력하세요:");
                int productPrice = scanner.nextInt();

                productNames[productCount] = productName;
                productPrices[productCount] = productPrice;
                productCount++;
            } else if (optionNum == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (optionNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
