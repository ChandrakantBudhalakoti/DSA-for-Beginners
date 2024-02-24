/*Polymorphism is considered one of the important features of Object-Oriented Programming. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.
 * there are two types of polymorphism 
 * 1. Compile-time Polymorphism: It is also known as static polymorphism. This type of polymorphism is achieved by function overloading 
 * 2. Runtime Polymorphism : It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding. 
*/

public class PolyMorphishm {
    public static void main(String[] args) {

        System.out.println(MethodOverloding.multiple(3, 2));// 6
        System.out.println(MethodOverloding.multiple(3.4, 4.5));// 15.299999999999999
        System.out.println(MethodOverloding.multiple(3, 4, 5)); // 60
        // Creating object of class 1
        MethodOverRiding a;
        
        // Now we will be calling print methods
        // inside main() method

        a = new Child1();
        a.Print();

        a = new Child2();
        a.Print();
    }

    /**
     * MethodOverloding
     */
    static class MethodOverloding {
        static int multiple(int x, int y) {
            return x * y;
        }

        static double multiple(double x, double y) {
            return x * y;
        }

        static int multiple(int x, int y, int z) {
            return x * y * z;
        }
    }

    /**
     * MethodOverRiding
     */

    static class MethodOverRiding {
        void Print() {
            System.out.println("This is a print for Parent!");
        }
    }

    static class Child1 extends MethodOverRiding {
        void Print() {
            System.out.println("This is a print for Child");
        }
    }

    static class Child2 extends MethodOverRiding {
        void Print() {
            System.out.println("This is a print for GrandChild");
        }
    }
}
