// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Lab2_3{
    public static void main(String[] args) {
        // Superclass reference pointing to subclass objects
        Animal a;

        a = new Dog();  // reference to Dog
        a.sound();      // Calls Dog's version

        a = new Cat();  // reference to Cat
        a.sound();      // Calls Cat's version
    }
}
