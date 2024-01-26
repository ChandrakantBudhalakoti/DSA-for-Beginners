//passing an array as argument 
//we have two mrthods for passing any values in the functions 
// 1. Pass By Value (which mean any changes in the function will not reflect in the main function)
// 2. Pass By Reference (directly reflect in the main fnction)
//NOTE ->  Arrays are always Pass by Reference

public class passingArrayAsArgs {
    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int[] marks = { 98, 76, 89 };
        // Old Marks
        System.out.println("Old Marks : ");
        for (int i= 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ,");
        }
        System.out.println();

        update(marks);
        // Printing Updated Array
        System.out.println("Updated Marks : ");
        for (int i= 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ,");
        }
    }
}