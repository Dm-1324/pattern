package sorting.prac;

public class Insertion {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 8, 5, 4, 7, 6, 9};
        for (int i = 1; i < arr1.length; i++) {
            int current = arr1[i];
            int j = i - 1;
            while (j >= 0 && current < arr1[j]) {
                arr1[j + 1] = arr1[j];
                j--;
            }
            arr1[j + 1] = current;
        }
        printArray(arr1);
    }
}
