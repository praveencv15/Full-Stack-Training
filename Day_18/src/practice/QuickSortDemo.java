package practice;
import java.util.*;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};

        sort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = dup(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }

    static int dup(int[] arr, int low, int high) {
        int x = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < x) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
