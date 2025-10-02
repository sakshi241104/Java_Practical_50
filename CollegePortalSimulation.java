// Assignment 2
// Define an abstract Person class
abstract class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getRole();
}

// Define Login interface
interface Login {
    boolean login(String username, String password);
}

// Student class
class Student extends Person implements Login {
    private String validUsername = "Sakshi";
    private String validPassword = "studentpass";

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public boolean login(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }
}

// Faculty class
class Faculty extends Person implements Login {
    private String validUsername = "ProfX";
    private String validPassword = "facultypass";

    public Faculty(String name, String id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    @Override
    public boolean login(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }
}

// Main / Demo class
public class CollegePortalSimulation {
    public static void main(String[] args) {
        // Suppose we are dealing with a student
        Person p = new Student("Sakshi", "S101");
        Login loginEntity = (Login) p;

        String inputUsername = "Sakshi";
        String inputPassword = "studentpass";

        if (loginEntity.login(inputUsername, inputPassword)) {
            System.out.println("Student Login Successful");
            System.out.println("Role: " + p.getRole());
            System.out.println("Name: " + p.name);
            System.out.println("ID: " + p.id);
        } else {
            System.out.println("Login Failed");
        }
    }
}
