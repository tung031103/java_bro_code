package tren_lop;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("nhap so phan tu: ");
        n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("so phan tu vua nhap: ");
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
