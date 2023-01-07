package lesson39;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class lesson39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // exception handling(xử lý ngoại lệ)
        try {

            System.out.println("enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("enter a whole to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("x / y = " + z);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero! IDIOT! ");
        } catch (InputMismatchException e) {
            System.out.println("Please, enter a number OMFG!!");
        } catch (Exception e) {
            System.out.println("Some thing went wrong!!");
        } finally {
            scanner.close();
        }

    }
}
