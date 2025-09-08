// Define interface Printable
interface Printable {
    void print();
}

// Define interface Showable
interface Showable {
    void show();
}

// Student class implements both interfaces
class Student implements Printable, Showable {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implement print() from Printable
    @Override
    public void print() {
        System.out.println("Student Name: " + name);
    }

    // Implement show() from Showable
    @Override
    public void show() {
        System.out.println("Student Age: " + age);
    }
}

// Main class
public class Lab2_2 {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student("Sakshi", 20);

        // Call methods from both interfaces
        s1.print();
        s1.show();
    }
}

