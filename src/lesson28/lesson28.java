package lesson28;

public class lesson28 {
    public static void main(String[] args) {
        // int[] number = new int[3];
        // char[] characters = new char[4];
        // String[] strings = new String[5];

        // Array object in java
        // food[] refrigerator = new food[3];
        food food1 = new food("pizza");
        food food2 = new food("hamberger");
        food food3 = new food("hotdog");
        food food4 = new food("tomato");

        food[] refrigerator = { food1, food2, food3, food4 };

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
        System.out.println(refrigerator[3].name);

    }
}
