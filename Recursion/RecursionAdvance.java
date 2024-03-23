package Recursion;

public class RecursionAdvance {
    // Problem 1: Tilling Porblem 
    public static int tillingProblem(int n){
        //base case 
        if(n==0 || n==1){
            return 1;
        }
        //recursive case
        //if vertical direction choice
        int fnm1 = tillingProblem(n-1);
        int fnm2 = tillingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    
}
