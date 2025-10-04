import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();  // read as String
            int age = Integer.parseInt(input);  // may throw NumberFormatException

            // (Optional) You can validate the range too, e.g. non-negative, etc.
            System.out.println("You entered age: " + age);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        finally {
            // System.out.println("Age validation check complete.");
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
