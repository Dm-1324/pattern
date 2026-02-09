package sorting;

public class MergeSort {
    public static void divide(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;

        divide(arr, left, mid);
        divide(arr, mid + 1, right);
        conquer(arr, left, mid, right);

    }

    public static void conquer(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) temp[k++] = ((arr[i] <= arr[j]) ? arr[i++] : arr[j++]);
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
