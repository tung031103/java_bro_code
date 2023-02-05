package lesson72;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

public class lesson72 {
    public static void main(String[] args) {

        // Generics Class

        MyGenericsClass<Integer, Integer> myInt = new MyGenericsClass<>(1, 9);
        MyGenericsClass<Double, Double> myDouble = new MyGenericsClass<>(3.14, 1.1);
        // MyGenericsClass<Character, Character> myChar = new MyGenericsClass<>('@',
        // '$');
        // MyGenericsClass<String, Character> myString = new MyGenericsClass<>("hello",
        // '!');

        HashMap<Integer, String> user = new HashMap<>();

        // ArrayList<String> myFriends = new ArrayList<>();

        // Class normal
        // MyIntegerClass myInt = new MyIntegerClass(1);
        // MyDoubleClass myDouble = new MyDoubleClass(3.14);
        // MyCharacterClass myChar = new MyCharacterClass('@');
        // MyStringClass myString = new MyStringClass("hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        // System.out.println(myChar.getValue());
        // System.out.println(myString.getValue());

        // Integer[] intArray = { 1, 2, 3, 4, 5 }; // số nguyên
        // Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 }; // số thực
        // Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' }; // kiểu kí tự
        // String[] stringArray = { "B", "Y", "E" }; // kiểu chuỗi
        // displayArray(intArray);
        // displayArray(doubleArray);
        // displayArray(characterArray);
        // displayArray(stringArray);

        // System.out.println(getFirst(intArray));
        // System.out.println(getFirst(doubleArray));
        // System.out.println(getFirst(characterArray));
        // System.out.println(getFirst(stringArray));

        // Player player = new Player();
        // Enemy enemy = new Enemy();
        // Item item = new Item();
        // Tree tree = new Tree();

        // draw(player);
        // draw(enemy);
        // draw(item);
        // draw(tree);

    }

    // public static <Thing> void draw(Thing x) {
    // x.draw();
    // }

    // generics function
    // public static <Thing> void displayArray(Thing[] array) {
    // for (Thing x : array) {
    // System.out.print(x + " ");
    // }
    // System.out.println();
    // }

    // public static <Thing> Thing getFirst(Thing[] array) {
    // return array[0];
    // }

    // public static void displayArray(Double[] array) {
    // for (Double x : array) {
    // System.out.print(x + " ");
    // }
    // System.out.println();
    // }

    // public static void displayArray(Character[] array) {
    // for (Character x : array) {
    // System.out.print(x + "");
    // }
    // System.out.println();
    // }

    // public static void displayArray(String[] array) {
    // for (String x : array) {
    // System.out.print(x + "");
    // }
    // System.out.println();
    // }

}
