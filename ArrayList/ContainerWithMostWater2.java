package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater2 {
    public static int storeWater(ArrayList<Integer> heights) {
        int maxWater = 0;
        int leftPointer = 0;
        int rightPointer = heights.size() - 1;
        while (leftPointer < rightPointer) {
            int height = Math.min(heights.get(leftPointer), heights.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currWater = height * width;
            maxWater = Math.max(maxWater, currWater);
            if (heights.get(leftPointer) < heights.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        System.out.println(storeWater(heights));
    }
}
