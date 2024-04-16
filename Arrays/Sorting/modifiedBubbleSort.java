package Sorting;

public class modifiedBubbleSort {
    public static void ModifiedBubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapped
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
    public static void main (String[] args){
        int[] arr = { 5, 4, 1, 3, 2 };
        ModifiedBubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}