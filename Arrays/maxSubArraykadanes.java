/**
 * KADANES Algorithm
 */
public class maxSubArraykadanes {
    public static void kadanes(int[] numbers) {
        int current_sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            current_sum += numbers[i];
            if (current_sum < numbers[i]) {
                current_sum = numbers[i];
            }
            if (maxSum < current_sum) {
                maxSum = current_sum;
            }
        }
        System.out.println("Maximum contiguous sum is: " + maxSum);

    }

    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }

}
