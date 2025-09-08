// Abstract class Shape
abstract class Shape {
    // Abstract methods
    abstract double calculateArea();
    abstract void display();
}

// Circle class derived from Shape
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
    }
}

// Rectangle class derived from Shape
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void display() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

// Main class
public class Lab2_1 {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Display details
        circle.display();
        System.out.println("--------------------");
        rectangle.display();
    }
}
