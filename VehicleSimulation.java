// Assignment 1

// Abstract class
abstract class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Abstract method
    abstract void start();

    // Concrete method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Interface
interface FuelEfficient {
    double calculateMileage();  // method to calculate mileage
}

// Car class
class Car extends Vehicle implements FuelEfficient {

    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println(brand + " car is starting...");
    }

    @Override
    public double calculateMileage() {
        // Example logic for car mileage
        return 15.5;  // in km per litre
    }
}

// Bike class
class Bike extends Vehicle implements FuelEfficient {

    Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println(brand + " bike is starting...");
    }

    @Override
    public double calculateMileage() {
        // Example logic for bike mileage
        return 40.0;  // in km per litre
    }
}

// Main class to test
public class VehicleSimulation {
    public static void main(String[] args) {
        Car car = new Car("Honda", 180);
        Bike bike = new Bike("Yamaha", 120);

        car.displayInfo();
        car.start();
        System.out.println("Car Mileage: " + car.calculateMileage() + " km/l");
        System.out.println();

        bike.displayInfo();
        bike.start();
        System.out.println("Bike Mileage: " + bike.calculateMileage() + " km/l");
    }
}
