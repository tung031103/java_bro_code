package lesson35;

public class lesson35 {
    public static void main(String[] args) {
        // đóng gói trong java
        car35 car1 = new car35("Ford", "Mustang", 2020);
        car35 car2 = new car35("BMW", "i8", 2021);
        // car.setYear(2022);
        // System.out.println(car.getMake());
        // System.out.println(car.getModel());
        // System.out.println(car.getYear());
        // car2.coppy(car1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}