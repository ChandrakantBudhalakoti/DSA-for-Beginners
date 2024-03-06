/*Interface - intreface is the blueprint of the class
 * we use interfaces for achieving multiple inheritence.
 * and for the total abstraction .
 * basic properties for interfaces:-
 * we create a interface by using interface keyword.
 * if we wnats to inherit the interface then we use implements keyword instead of extends
 * all methods are public, abstract & without implementation 
 * used to achieve total abstraction 
 * variable in the interface are final, public and static 
 */
public class Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
    
}
interface ChessPlayer{
    void moves();  //Declare a method called "moves".
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right and diagonal (in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left and right ");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right and diagonal (by 1 step)");
    }
}