package ArrayList;
import java.util.ArrayList;
public class BasicsofArrayList {
    public static void main(String[] args) {
        //ArrayList Creation 
        ArrayList <Integer> List = new ArrayList<>();
        //1st Add operation
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(List);//[1, 2,  3, 4, 5]
        //Add at specific position 
        List.add(0, 14);
        System.out.println(List);

    }
    
}
