package lesson31;

public class lesson31 {
    public static void main(String[] args) {
        // inheritance(kế thừa)

        car31 car = new car31();
        car.go();

        bicycle bike = new bicycle();
        bike.stop();
        // bike.go();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
