package student.test;

import student.student;
// Import Student class
//import student.student;

public class Test {
    public static void main(String[] args) {
        student s = new student();

        // Accessible variables
        System.out.println("Name (public): " + s.name); // ✅ accessible everywhere

        // System.out.println("Age (private): " + s.age); 
        // ❌ Not accessible (private to Student class)

        // System.out.println("Course (protected): " + s.course);
        // ❌ Not accessible (only within same package or subclass)

        // System.out.println("College (default): " + s.college);
        // ❌ Not accessible (package-private, only same package)

        System.out.println("--------------------");
        System.out.println("Accessing all variables via public method:");
        s.display(); // ✅ works, since method is public
    }
}
