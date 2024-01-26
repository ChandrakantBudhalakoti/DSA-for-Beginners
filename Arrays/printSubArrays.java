// subArrays are a continuous part of an array 
public class printSubArrays{
    public static void printSubArray(int [] numbers){
        int totalSubArr = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i; j< numbers.length; j++){
                for (int k = i; k<=j; k++){
                    System.out.print(numbers[k] + " " );
                }
                totalSubArr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub Array are -> " + totalSubArr);

    }

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        printSubArray(numbers);
    }
}