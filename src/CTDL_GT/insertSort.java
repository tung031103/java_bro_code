package CTDL_GT;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = { 9, 7, 5, 3, 2, 1, 4, 6, 8 };
        System.out.println("array before sort: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("array after sort: ");
        insert_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void insert_sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }
}
