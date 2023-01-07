import java.util.Random;

public class lesson9 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        int y = random.nextInt(6) + 1;
        int z = random.nextInt(6) + 1;
        // double y = random.nextDouble();
        // boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
