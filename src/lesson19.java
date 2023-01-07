public class lesson19 {
    public static void main(String[] args) {
        // method no return
        // String name = "tung";
        // int age = 19;
        // hello(name, age);

        // method has return
        int x = 3;
        int y = 4;
        int z = add(x, y);
        System.out.println(z);
    }
    // method no return
    // static void hello(String name, int age) {
    // System.out.println("hello " + name);
    // System.out.println("you are " + age);
    // }

    // method has return
    static int add(int a, int b) {
        return a + b;
    }

}
