package tren_lop;

import java.util.Scanner;

public class tam_giac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        // vòng lặp ko biết trước số lần lặp
        while (true) {
            System.out.print("moi nhap a: ");
            a = scanner.nextFloat();
            System.out.print("moi nhap b: ");
            b = scanner.nextFloat();
            System.out.print("moi nhap c: ");
            c = scanner.nextFloat();
            if (a + b > c && b + c > a && a + c > b) {
                break;
            }
            System.out.println("Nhap sai. Moi nhap lai.");
        }
        System.out.printf("chu vi cua tam giac la: %.2f\n", a + b + c);
        scanner.nextLine();
        float p = (a + b + c) / 2;
        System.out.printf("dien tich cua tam giac la: %.2f", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
