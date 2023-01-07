import java.util.ArrayList;

public class lesson18 {
    public static void main(String[] args) {
        // for each loop in java
        // String[] animals = { "cat", "dog", "bird" };
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("rat");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
