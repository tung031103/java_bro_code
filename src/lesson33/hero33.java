package lesson33;

public class hero33 extends person33 {
    String power;

    hero33(String name, int age, String power) {
        super(name, age); // cái này cũng giống như this.name or this.age
        this.power = power;

    }

    public String toString() {
        return super.toString() + this.power;
    }
}
