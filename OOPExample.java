// Base class (Parent)
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

// Derived class (Child)
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal(); // Object of base class
        Dog myDog = new Dog();              // Object of derived class

        genericAnimal.speak(); // Output: Animal speaks
        myDog.speak();         // Output: Dog barks
    }
}