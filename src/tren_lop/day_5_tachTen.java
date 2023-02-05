package tren_lop;

import java.util.Scanner;

public class day_5_tachTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String fullName = sc.nextLine();
        String fn = fullName.trim();

        System.out.println("Ho ten: " + fullName.toUpperCase());

        int a = fn.indexOf(" ");
        int b = fn.lastIndexOf(" ");

        String firstName = fn.substring(0, a);
        String midName = fn.substring(a, b);
        String lastName = fn.substring(b);

        System.out.println("Ho la: " + firstName);
        System.out.println("Ho dem la: " + midName);
        System.out.println("ten la: " + lastName);
    }
}
