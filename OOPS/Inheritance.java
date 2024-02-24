// Java program to illustrate the concept of inheritance
// learning inheritance 
// Base class (Parent class)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
// Single Inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance: Puppy is a subclass of Dog
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Hybrid Inheritance: Cat is a subclass of Animal and implements Climbing
class Cat extends Animal implements Climbing {
    void meow() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void climb() {
        System.out.println("Cat is climbing");
    }
}

// Interface for Climbing
interface Climbing {
    void climb();
}

// Hybrid Inheritance: Tiger is a subclass of Animal, Dog, and implements Climbing
class Tiger extends Dog implements Climbing {
    void growl() {
        System.out.println("Tiger is growling");
    }

    @Override
    public void climb() {
        System.out.println("Tiger is climbing");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Hybrid Inheritance Examples
        Cat myCat = new Cat();
        myCat.eat();
        myCat.sleep();
        myCat.meow();
        myCat.climb();
        System.out.println();

        Tiger myTiger = new Tiger();
        myTiger.eat();
        myTiger.sleep();
        myTiger.bark();
        myTiger.growl();
        myTiger.climb();
    }
}
