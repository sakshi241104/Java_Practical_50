// File: VotingMachineDemo.java

// Custom checked exception
class MinorAgeException extends Exception {
    public MinorAgeException(String message) {
        super(message);
    }
}

// VotingMachine class with main
public class VotingMachine {

    public void castVote(int age) throws MinorAgeException {
        if (age < 18) {
            throw new MinorAgeException("Voter is not eligible to vote.");
        } else {
            System.out.println("Vote cast successfully.");
        }
    }

    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();

        try {
            // Try with an under-age value
            vm.castVote(16);
        } catch (MinorAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Also try with a valid voting age
            vm.castVote(20);
        } catch (MinorAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
