import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        // input in java
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name: ");
        String name = scanner.nextLine();
        System.out.println("how old are you: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favorite food: ");
        String food = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old!");
        System.out.println("you like " + food);
    }
}
