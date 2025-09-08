// Calculator class with overloaded methods
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class Lab2_4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc.add(3.5, 2.7));
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));
    }
}

    
