public class TrappingRainwater {
    public static int TrappedRainWater(int [] height) {
        if (height == null || height.length < 3) return 0;
        // calculate left max boundary - array
        int [] LeftMax = new int[height.length];
        LeftMax[0] = height[0];
        for (int i = 1; i  < LeftMax.length; i++) {
            LeftMax[i] = Math.max(height [i], LeftMax[i-1]);
        }

        // calculate right max boundary - array
        int [] RightMax = new int[height.length];
        RightMax[height.length - 1] = height[height.length - 1];
        for (int j = height.length - 2; j >= 0; j--) {
            RightMax[j] = Math.max(height[j], RightMax[j+1]);
        }
        //loop
        int TrappedWater = 0;
        for (int i =0 ; i<height.length; i++){
            //waterLevel = min(leftMaxBoud, rightmaxBound)
            int Waterlevel = Math.min(LeftMax[i], RightMax[i]);
            //trapped water = Waterlevel - height[i] 
            TrappedWater += Waterlevel -height[i];
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        int [] height = {4,2,0,6,3,2,5};
        System.out.println(TrappedRainWater(height));
    }
    
}
