/**
 * BRUTEFORCE_APPROACH    
 */
public class maxSubArray{
    public static void maxSubArraySum(int [] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j< numbers.length; j++){
                currentSum = 0;
                for (int k = i; k<=j; k++){
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum in Array are -> " + maxSum);

    }

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        maxSubArraySum(numbers);
    }
}
