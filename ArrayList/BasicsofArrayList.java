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
        //2nd Get operation
        int element = List.get(2);
        System.out.println(element);//2
        //3rd Remove operation
        List.remove(3);
        System.out.println(List);//[14, 1, 2, 5]
        //4th Set operation
        List.set(2, 100);
        System.out.println(List);//[14, 100, 1, 2, 5]
        //5th Size operation
        System.out.println(List.size());//5
    }
    
}
