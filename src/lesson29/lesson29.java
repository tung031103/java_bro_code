package lesson29;

public class lesson29 {
    public static void main(String[] args) {
        // java object passing
        garage garage = new garage();
        car car1 = new car("BMW");
        car car2 = new car("tesla");
        garage.park(car1);
        garage.park(car2);

    }
}