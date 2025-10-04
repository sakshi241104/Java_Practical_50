public class SpeedController {

    public void checkSpeed(int speed) {
        if (speed > 100) {
            throw new ArithmeticException("Speed limit exceeded!");
        } else {
            System.out.println("Speed is normal.");
        }
    }

    public static void main(String[] args) {
        SpeedController controller = new SpeedController();
        try {
            controller.checkSpeed(80);   // safe
            controller.checkSpeed(120);  // exceeds limit, should throw
        }
        catch (ArithmeticException e) {
            // This will catch the exception thrown by checkSpeed
            System.out.println("Error: " + e.getMessage());
        }
    }
}
