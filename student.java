package student;

public class student {
    // Variables with different access modifiers
    public String name = "Sakshi";        // accessible everywhere
    private int age = 20;                 // accessible only inside Student class
    protected String course = "Electronics and Computer Science"; // accessible in same package & subclasses
    String college = "WIT Solapur";       // default (package-private), same package only

    // Public method to show variables
    public void display() {
        System.out.println("Name (public): " + name);
        System.out.println("Age (private): " + age);
        System.out.println("Course (protected): " + course);
        System.out.println("College (default): " + college);
    }
}
