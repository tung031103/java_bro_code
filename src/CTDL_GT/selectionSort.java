package CTDL_GT;

public class selectionSort {
    public static void main(String[] args) {
        // selection sort big O(n^2) complexity runtime
        int[] arr = { 9, 3, 1, 2, 5, 4, 6, 8, 7 };
        System.out.println("array before sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SelectionSort(arr);
        System.out.println("array after sort: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
}
