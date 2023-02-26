package CTDL_GT;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-in First-out
        // stores objects intto a sort of "vertical tower"
        // push() to add to the top
        // pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty()); return true because in stack empty

        stack.push("Minecraft");
        stack.push("Wild Rift");
        stack.push("DOOM");
        stack.push("league of legend");

        // System.out.println(stack.empty()); // false because it pushed in stack 4
        // object

        // String myFavGame = stack.pop(); // remove object on top

        // System.out.println(myFavGame); // return a object pop in stack
        // System.out.println(stack);
        // System.out.println(stack.peek()); // return a object on top without remove
        // stack

        // System.out.println(stack); // return a array pushed in stack

        // System.out.println(stack.search("DOOM")); // return a number in stack

    }
}
