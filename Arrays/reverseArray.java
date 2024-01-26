// for optimal approach we can use swapping 
public class reverseArray {
    public static void reverseArr(int [] numbers){
        int start =0;
        int end = numbers.length - 1;
        int temp;
        while (start < end) {
            temp=numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        reverseArr(numbers);
        System.out.print("Reversed array is-> ");
        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }

    
}
