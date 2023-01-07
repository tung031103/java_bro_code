package lesson26;

public class lesson26 {
    public static void main(String[] args) {
        // overload constructor
        pizza pizza = new pizza("bread", "tomato", "cheese", "sea");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
