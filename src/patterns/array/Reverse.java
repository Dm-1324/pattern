package patterns.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr1));
        int l = 0;
        int r = arr1.length - 1;
        while (r > l) {
            int temp = arr1[l];
            arr1[l] = arr1[r];
            arr1[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
