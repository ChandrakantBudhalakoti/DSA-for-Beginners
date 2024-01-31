package Sorting;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countSort(arr);
        printArr(arr);
        // System.out.print("Sorted array is: ");
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");

    }

    public static void countSort(int[] arr) {
        // Find the maximum element in array to know the range of elements.
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // Create a count array and initialize it with largest + 1.
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
