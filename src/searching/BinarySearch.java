package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearching(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 5, 6, 32, 12, 21, 23, 322, 122, 9, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = sc.nextInt();

        System.out.println();


        int position = BinarySearching(array, target);
        if (position != -1) {
            System.out.println("Target " + target + " found on location " + position);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }
}
