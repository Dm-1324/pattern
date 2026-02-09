package searching;

import java.util.Arrays;

public class LinearSearch {
    public static int LinearSearching(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 12, 122, 1234, 133, 43, 65, 76, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int target = 66;
        int position = LinearSearching(array, target);

        if (position != -1) {
            System.out.println(target + " found on location " + position);
        } else {
            System.out.println(target + " not found in the array");
        }
    }
}
