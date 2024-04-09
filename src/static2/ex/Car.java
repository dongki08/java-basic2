package static2.ex;

public class Car {

    private String name;

    private static int totalCars;


    public Car(String name) {
        this.name = name;
        totalCars++;
        carPrint();
    }

    private void carPrint() {
        System.out.println("차량구입, 이름 : " + name);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
