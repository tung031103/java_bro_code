import java.util.Scanner;

public class lesson13 {
    public static void main(String[] args) {
        // while loop
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            System.out.println("enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
