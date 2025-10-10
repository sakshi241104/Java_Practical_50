//Lab-6 Assignment-2
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordCounter {

    // Method to process the file
    public static void processFile(String filePath) {
        Set<String> hashSet = new HashSet<>();  // For counting unique words
        Set<String> treeSet = new TreeSet<>();  // For alphabetical listing

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z\\s]", " ");

                // Split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        hashSet.add(word);
                        treeSet.add(word);
                    }
                }
            }

            // Task A: Unique word count
            System.out.println("=== Task A: Count Unique Words ===");
            System.out.println("Total unique words: " + hashSet.size());

            // Task B: Alphabetical listing
            System.out.println("\n=== Task B: List Unique Words Alphabetically ===");
            for (String word : treeSet) {
                System.out.println(word);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Change the path to the file you want to test with
        String filePath = "sample.txt";
        processFile(filePath);
    }
}
