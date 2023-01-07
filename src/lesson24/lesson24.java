package lesson24;

public class lesson24 {
    public static void main(String[] args) {
        human human1 = new human("rick", 19, 170.00);
        human human2 = new human("Luong", 19, 167.00);
        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();
    }
}
