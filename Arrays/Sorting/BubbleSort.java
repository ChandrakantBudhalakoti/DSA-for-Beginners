package Sorting;

public class BubbleSort {
    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 1; i<=arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        sorting(arr);
        printArr(arr);
    }
}
