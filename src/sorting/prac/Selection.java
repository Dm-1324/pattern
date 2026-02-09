package sorting.prac;

public class Selection {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 8, 5, 4, 7, 6, 9};
        for (int i = 0; i < arr1.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[smallest] > arr1[j]) {
                    smallest = j;
                }
            }
            int temp = arr1[smallest];
            arr1[smallest] = arr1[i];
            arr1[i] = temp;
        }
        printArray(arr1);

    }
}
