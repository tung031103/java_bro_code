package lesson37;

public class lesson37 {
    public static void main(String[] args) {
        // polymorphism (tính đa hình trong java)

        car37 car = new car37();
        bicycle37 bicycle = new bicycle37();
        boat37 boat = new boat37();
        vehicle37[] racers = { car, bicycle, boat };

        // car.go();
        // boat.go();
        // bicycle.go();

        for (vehicle37 x : racers) {
            x.go();
        }
    }
}
