package bai_tap_java;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        int a, b, s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        a = scanner.nextInt();
        System.out.println("nhap vao so b: ");
        b = scanner.nextInt();
        s = (a > b) ? a : b;
        System.out.println("so lon nhat la: " + s);
    }
}
