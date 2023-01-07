package lesson30;

public class friend {
    String name;
    static int numberOfFriends;

    friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("you have " + numberOfFriends + " friends");
    }
}
