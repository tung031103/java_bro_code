import java.util.ArrayList;

public class lesson17 {
    public static void main(String[] args) {
        // array list
        ArrayList<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("hamberger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        // ArrayList 2D

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("cocacola");
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(1));
    }
}
