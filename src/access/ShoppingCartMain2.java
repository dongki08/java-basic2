package access;

public class ShoppingCartMain2 {
    public static void main(String[] args) {
        ShoppingCart2 cart2 = new ShoppingCart2();

        Item2 item21 = new Item2("마늘", 2000, 2);
        Item2 item22 = new Item2("상추", 3000, 4);

        cart2.addItem(item21);
        cart2.addItem(item22);

        cart2.disPlayItems2();

    }
}
