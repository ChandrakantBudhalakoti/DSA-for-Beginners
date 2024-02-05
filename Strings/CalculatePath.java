/*Que. Given a route containing 4 direction (NEWS) find the shortest path to reach the destination?
    Given direction are: "N"(north), "E"(east), "S"(south), "W"(west).
    "WNEENESENNN" and we know the formula  is Math.sqrt(x2 + y2);
 */

package Strings;
public class CalculatePath {
    public static void main(String[] args) {
        String route = "WNEENESENNN"; //Input Route
        System.out.println("Shortest route is -> "+calculateShortestDistance(route));
    }

    public static double  calculateShortestDistance(String route){
        int x=0, y=0;
        for (int i= 0; i<route.length();i++){
            char dir = route.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        double x2 = x*x;
        double y2 = y*y;
        return Math.sqrt(x2 + y2);
    }
    
}
