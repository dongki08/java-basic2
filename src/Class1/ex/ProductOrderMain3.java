package Class1.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("입력할 주문 갯수를 입력하세요 : ");
        int n = scan.nextInt();
        scan.nextLine();
        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.printf("%d번째 주문 정보를 입력하세요.\n", i + 1);

            System.out.print("상품명 : ");
            String productName = scan.next();
            System.out.print("가격 : ");
            int price = scan.nextInt();
            System.out.print("수량 : ");
            int quantity = scan.nextInt();
            scan.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrder(orders);
        System.out.println(getTotalAmount(orders));

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
