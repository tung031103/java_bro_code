package CTDL_GT;

public class Recursion {
    public static void main(String[] args) {
        // recursion (Dệ quy)
        // walk(5);

        // System.out.println(factorial(4)); // tính giai thừa

        // System.out.println(power(2, 3)); // tính số mũ

    }

    public static void walk(int steps) {
        // for (int i = 0; i < steps; i++) {
        // System.out.println("you take a step!");

        // }

        // it like as for loop above
        if (steps < 1)
            return; // base
        System.out.println("you take a step!");
        walk(steps - 1); // recursive
    }

    public static int factorial(int num) {
        if (num < 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static int power(int base, int exponent) {
        if (exponent < 1)
            return 1;
        return base * power(base, exponent - 1); // recursive case

    }
}
