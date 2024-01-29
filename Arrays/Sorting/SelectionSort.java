// Overview
// Selection sort is a simple sorting algorithm that works by repeatedly selecting the smallest unsorted element and swapping it with the leftmost unsorted element. This process continues until the entire array is sorted.
package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;// Position of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minPos]) // if we find a smaller value, then update the minimum position
                    minPos = j;
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 23, 67, 10, 5 };
        System.out.println("Given Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("\nSorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
