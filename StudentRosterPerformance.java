//Lab-6 Assignment-1
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StudentRosterPerformance {

    public static void main(String[] args) {
        // Create two lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        int totalStudents = 50000;

        // Add 50,000 students to both lists
        for (int i = 1; i <= totalStudents; i++) {
            String student = "Student " + i;
            arrayList.add(student);
            linkedList.add(student);
        }

        // Task A: Insertions at the Beginning
        System.out.println("=== Task A: Insertions at the Beginning ===");

        long startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            arrayList.add(0, "New Student " + i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList insertion time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        for (int i = 1; i <= 1000; i++) {
            linkedList.add(0, "New Student " + i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList insertion time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Task B: Random Access
        System.out.println("\n=== Task B: Random Access ===");

        Random random = new Random();
        int accesses = 10000;
        int sizeArray = arrayList.size();
        int sizeLinked = linkedList.size();

        // ArrayList random access
        startTime = System.nanoTime();
        for (int i = 0; i < accesses; i++) {
            int index = random.nextInt(sizeArray);
            arrayList.get(index);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList random access time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // LinkedList random access
        startTime = System.nanoTime();
        for (int i = 0; i < accesses; i++) {
            int index = random.nextInt(sizeLinked);
            linkedList.get(index);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList random access time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}

