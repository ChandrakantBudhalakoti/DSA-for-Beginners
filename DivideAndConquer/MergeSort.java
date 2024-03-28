package DivideAndConquer;

public class MergeSort {
    // First WAP for Printing array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Second WAP for Merge Sort
    public static void mergeSort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // find the middle point to divide array into two halves
        int mid = si + (ei - si) / 2;
        // recursively call mergeSort for left half and right half
        mergeSort(arr, si, mid);// left half
        mergeSort(arr, mid + 1, ei);// right half
        // merge the two halves
        merge(arr, si, mid, ei);
    }

    // Third WAP for Merging
    public static void merge(int[] arr, int si, int mid, int ei) {
        // create temp arrays
        int[] temp = new int[ei - si + 1];
        // because java is 0 based indexing language so we add 1 in size of temp array
        // initialzing iterators
        int i = si;// iterator for left half
        int j = mid + 1;// iterator for right half
        int k = 0; // iterator for temp array
        // now we need to compare both array elements and sort them accordingly
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // copy remaining elements of right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp array to original array
        for (k = 0, i = si; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // Main method
    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 5, 2, 8, -2 };
        System.out.println("Given Array");
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        printArr(arr);
    }
}
