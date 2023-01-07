import java.util.Scanner;

public class lesson14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";
        System.out.println("enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("enter # of columns: ");
        cols = scanner.nextInt();

        System.out.println("enter Symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= cols; j++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
