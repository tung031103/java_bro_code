package lesson23;

public class lesson23 {

    public static void main(String[] args) {
        // oop lập trình hướng đối tượng, java là 1 ngôn ngữ hướng đối tượng hoàn toàn
        // java constructor
        car myCar1 = new car();
        car myCar2 = new car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        // myCar.drive();
        // myCar.brake();
    }
}
