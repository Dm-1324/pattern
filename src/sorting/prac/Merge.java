package sorting.prac;

public class Merge {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void divide(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;

        divide(arr, left, mid);
        divide(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] < arr[j] ? arr[i++] : arr[j++]);
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 8, 5, 4, 7, 6, 9};
        int n = arr1.length;
        divide(arr1, 0, n - 1);
        printArray(arr1);

    }
}
