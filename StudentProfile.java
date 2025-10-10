//Lab-5 Assignment-5
import java.io.*;

class Student implements Serializable {
    int id; String name; double gpa;
    transient String password;

    Student(int i, String n, double g, String p) {
        id = i; name = n; gpa = g; password = p;
    }
}

public class StudentProfile {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sakshi", 8.7, "mypassword");

        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            o.writeObject(s1);
            System.out.println("Object saved!");
        } catch (Exception e) { System.out.println(e); }

        try (ObjectInputStream i = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) i.readObject();
            System.out.println("Loaded Object:");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);
            System.out.println("GPA: " + s2.gpa);
            System.out.println("Password: " + s2.password);
        } catch (Exception e) { System.out.println(e); }
    }
}
