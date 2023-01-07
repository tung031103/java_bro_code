public class lesson20 {
    public static void main(String[] args) {
        // overload method
        int x = add(1, 2, 3, 4);
        System.out.println(x);
        double y = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(y);
    }

    static int add(int a, int b) {
        System.out.println("this is overload method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("this is overload method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("this is overload method #3");
        return a + b + c + d;
    }

    static double add(Double a, Double b) {
        System.out.println("this is overload method #4");
        return a + b;
    }

    static double add(Double a, Double b, Double c) {
        System.out.println("this is overload method #5");
        return a + b + c;
    }

    static double add(Double a, Double b, Double c, Double d) {
        System.out.println("this is overload method #6");
        return a + b + c + d;
    }
}
