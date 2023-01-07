package lesson36;

public class lesson36 {
    public static void main(String[] args) {
        // java interface
        rabbit36 rabbit = new rabbit36();

        rabbit.flea();

        hawk36 hawk = new hawk36();
        hawk.hunt();

        fish36 fish = new fish36();
        fish.hunt();
        fish.flea();
    }
}
