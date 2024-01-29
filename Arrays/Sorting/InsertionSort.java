package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Given Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("\nSorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // Insertion sort algorithm

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // iterate over the array
            int key = arr[i]; // store the current element as key
            int j = i - 1; // initialize the index of the previous element

            // shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at its correct position
            arr[j + 1] = key;
        }
    }
}
