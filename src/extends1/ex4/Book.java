package extends1.ex4;

public class Book extends Item{

    public Book(String name, int price, String writer, int isbn) {
        super(name, price);
        System.out.println("- 저자 : " + writer + " isbn : " + isbn);
    }
}
