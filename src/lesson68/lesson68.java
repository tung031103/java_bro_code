package lesson68;

import java.util.Scanner;

public class lesson68 {
    public static void main(String[] args) {
        // custom exceptions
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        try {
            CheckAge(age);
        } catch (Exception e) {
            System.err.println("A problem occured: " + e);

        }
    }

    static void CheckAge(int age) throws ageException {
        if (age < 18) {
            throw new ageException("\n" + "you must be 18+ to sign up");
        } else {
            System.out.println("you are now signed up!");
        }
    }
}
