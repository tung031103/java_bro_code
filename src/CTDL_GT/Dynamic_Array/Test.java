package CTDL_GT.Dynamic_Array;

public class Test {
    public static void main(String[] args) {
        dynamic_array dynamicArray = new dynamic_array(5);

        // System.out.println(dynamicArray.capacity);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        // dynamicArray.insert(0, "x");
        // dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
