package extends1.ex4;

public class Album extends Item{

    public Album(String name, int price, String artist) {
        super(name, price);
        System.out.println("- 아티스트 : " + artist);
    }
}
