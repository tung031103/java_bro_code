import java.util.Scanner;

public class lesson12 {
    public static void main(String[] args) {
        // logical operator

        // int temp = 25;
        // if (temp > 30) {
        // System.out.println("It's hot outside");
        // } else if (temp >= 20 && temp <= 30) {
        // System.out.println("It's warm outside");
        // } else {
        // System.out.println("It's cold outside");
        // }
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! press q or Q to quit");
        String response = scanner.next();
        // if (response.equals("q") || response.equals("Q")) {
        // System.out.println("you quit the game");
        // } else {
        // System.out.println("you are still playing the game *pew pew");
        // }
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("you are still playing the game *pew pew");
        } else {
            System.out.println("you quit the game");
        }

    }
}
