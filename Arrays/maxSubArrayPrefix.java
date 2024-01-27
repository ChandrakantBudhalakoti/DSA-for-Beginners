/**
 * PREFIX ARRAY    
 */
public class maxSubArrayPrefix {
    public static void maxSubArraySum(int [] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int [] prefix = new int[numbers.length];
        prefix[0] = numbers [0];
        //calculate prefix array
        for(int i = 1; i< prefix.length; i++){
            prefix[i] = prefix[i -1]+ numbers[i];
        }

        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j< numbers.length; j++){
                currentSum = i == 0? prefix[j] : prefix[j] - prefix[i -1];
                
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum in Array are -> " + maxSum);

    }

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        maxSubArraySum(numbers);
    }
    
}
