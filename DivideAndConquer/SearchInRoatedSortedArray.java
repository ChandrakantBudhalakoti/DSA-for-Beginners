package DivideAndConquer;

public class SearchInRoatedSortedArray {
    public static int search(int[] arr, int tar, int si, int ei) {
        // base case
        if (si >ei){
            return -1;
        }
        //kaam
        int mid = si + (ei - si) / 2;
        //case FOUND
        if (arr[mid] == tar){
            return mid;
        }
        //mid on line 1
        if(arr[si] <= arr[mid]){
            //case a: LEFT
            if (arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid - 1);
            }else{
                //case b: RIGHT
            return search(arr, tar, mid + 1, ei);
            }   
        }
        //mid on line 2
        else{
            //case c: RIGHT
            if (arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid + 1, ei);
            }else{
                //case d: LEFT
            return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, -5 };
        int target = 0; // output -> 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);

    }

}
