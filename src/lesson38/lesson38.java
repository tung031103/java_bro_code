package lesson38;

import java.util.Scanner;

public class lesson38 {
    public static void main(String[] args) {
        // dynamic polymorphism (tính đa hình rộng)
        Scanner scanner = new Scanner(System.in);

        animal38 animal;
        System.out.println("what animal do you want?");
        System.out.println("1=dog or 2=cat: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new dog38();
            animal.speak();
        } else if (choice == 2) {
            animal = new cat38();
            animal.speak();
        } else {
            animal = new animal38();
            System.out.println("that choice invalid!!");
        }
    }
}
