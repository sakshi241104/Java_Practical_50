// Outer class
class Outer {
    private String message = "Hello from Outer class";

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class accessing: " + message);
        }
    }

    // Method in Outer class to access Inner class
    void accessInner() {
        Inner in = new Inner();  // Create Inner class object
        in.display();            // Call Inner class method
    }
}

// Interface for anonymous inner class demo
interface Greeting {
    void sayHello();
}

// Main class
public class Lab2_5 {
    public static void main(String[] args) {
        // Create Outer class object
        Outer outer = new Outer();

        // Access inner class through outer method
        outer.accessInner();

        System.out.println("-------------------");

        // Anonymous inner class implementing Greeting interface
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        // Call the method
        g.sayHello();
    }
}
