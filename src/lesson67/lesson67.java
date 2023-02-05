package lesson67;

import java.util.HashMap;

public class lesson67 {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, String> countries = new HashMap<String, String>();

        // add a key value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "BeiJing");
        // System.out.println(countries);
        // countries.remove("USA");
        // System.out.println(countries.get("Russia")); // trả về capital của nước đó
        // System.out.println(countries);
        // countries.clear();
        // System.out.println(countries.size());
        // countries.replace("USA", "HANOI");
        // System.out.println(countries.containsKey("USA")); // return true if England
        // return false
        // System.out.println(countries.containsValue("HANOI")); // return false because
        // it doesn't has in HashMap

        // System.out.println(countries);

        for (String i : countries.keySet()) {
            System.out.print("My capital " + i + " is "); // return countries
            System.out.println(countries.get(i)); // return capital

        }
    }
}
