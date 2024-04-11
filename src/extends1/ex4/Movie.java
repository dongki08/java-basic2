package extends1.ex4;

public class Movie extends Item{

    public Movie(String name, int price, String a, String b) {
        super(name, price);
        System.out.println("- 감독 : " + a + " 배우 : " + b);
    }
}
