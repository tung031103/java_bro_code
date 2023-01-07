public class lesson15 {
    // array
    public static void main(String[] args) {
        String[] car = { "Tesla", "Ford", "BMW" };
        car[0] = "Mustang";
        System.out.println(car[0]);

        // String[] cars = new String[3];
        // cars[0] = "Ford";
        // cars[1] = "Tesla";
        // cars[2] = "BMW";

        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }

        String[][] cars = new String[3][3];
        cars[0][0] = "Mec";
        cars[0][1] = "Lexus";
        cars[0][2] = "toyota";
        cars[1][0] = "ford";
        cars[1][1] = "Mec";
        cars[1][2] = "Lexus";
        cars[2][0] = "toyota";
        cars[2][1] = "Mec";
        cars[2][2] = "Lexus";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
