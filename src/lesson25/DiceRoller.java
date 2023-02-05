package lesson25;

import java.util.Random;

public class DiceRoller {

    Random random;
    int number = 0;
    int number2 = 0;
    int number3 = 0;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        number2 = random.nextInt(6) + 1;
        number3 = random.nextInt(6) + 1;
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
    }
}
