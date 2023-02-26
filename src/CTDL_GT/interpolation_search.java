package CTDL_GT;

public class interpolation_search {
    public static void main(String[] args) {
        // tìm kiếm nội suy O(log(log(n)))

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int index = interpolationSearch(array, 8);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Elemnt not found!");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
}
