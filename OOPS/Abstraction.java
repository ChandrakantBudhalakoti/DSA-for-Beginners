/* Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Another way, it shows only essential things to the user and hides the internal details*/
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println("------------------------");

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }

}

abstract class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walking on Four legs...");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walking on Two legs...");
    }
}