/* Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Another way, it shows only essential things to the user and hides the internal details*/
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);
        System.out.println("------------------------");

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);
    }

}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "darkBlack";
    }

    void walk() {
        System.out.println("Walking on Four legs...");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walking on Two legs...");
    }
}