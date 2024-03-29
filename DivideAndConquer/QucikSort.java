package DivideAndConquer;

public class QucikSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);// left side of pivot
        quickSort(arr, pIdx + 1, ei);// right side of pivot
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // first element smaller than the pivot value
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swapp
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // put the pivot at its correct position in sorted array
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}