package access;

public class ShoppingCart2 {
    private Item2[] items = new Item2[10];
    private int itemCount;

    public void addItem(Item2 item2) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item2;
        itemCount++;
    }

    public void disPlayItems2() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++) {
            Item2 item2 = items[i];
            System.out.println("상품명 : " + item2.name + " 합계 : " + item2.price * item2.dqantity);
        }
        System.out.println("전체 가격 합 : " + total());
    }
    private int total() {
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++) {
            Item2 item2 = items[i];
            totalPrice += (item2.price * item2.dqantity);
        }
        return totalPrice;
    }
}
