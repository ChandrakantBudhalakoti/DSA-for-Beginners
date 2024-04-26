package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> heights) {
        int maxWater = 0;
        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                int height = Math.min(heights.get(i), heights.get(j));
                // calculate the width, which is distance between two points
                int width = j - i;
                // calculate the area of this rectangle
                int currentWater = height * width;
                maxWater = Math.max(maxWater, currentWater);
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
