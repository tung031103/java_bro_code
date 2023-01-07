import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("nhap vao 1 so nguyen: ");
        // int a = scanner.nextInt(); // đọc vào 1 số nguyên
        // System.out.println("nhap vao 1 so float: ");
        // float floatValue = scanner.nextFloat(); // đọc vào 1 số thực
        // System.out.println("nhap vao 1 so 1 double: ");
        // double doubleValue = scanner.nextDouble();
        System.out.println("nhap vao 1 ki tu: ");
        char c = scanner.next().charAt(0); // đọc vào 1 kí tự
        System.out.println("ki tu ban vua nhap La:" + c);
        System.out.println("nhap vao 1 tu: ");
        String word = scanner.next(); // đọc vào 1 từ
        System.out.println("tu ban vua nhap la: " + word);
        scanner.nextLine();
        System.out.println("nhap vao 1 cau: ");
        String line = scanner.nextLine(); // đọc cả dòng
        System.out.println("cau ban vua nhap la: " + line);
        System.out.println("Nhap vao gia tri true/false: ");
        boolean booleanValue = scanner.nextBoolean(); // đọc vào giá trị boolean
        System.out.println("Ban vua nhap la: " + booleanValue);
    }
}
