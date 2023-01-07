public class lesson7 {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double d = Math.min(x, y);
        double e = Math.abs(y); // giá trị tuyệt đối
        double g = Math.sqrt(e); // giá trị tuyệt đối

        System.err.println("so lon nhat la: " + z);
        System.err.println("so nho nhat la: " + d);
        System.err.println("gia tri tuyet đoi: " + e);
        System.err.println("can bac 2 cua " + e + " la " + g);
    }
}
