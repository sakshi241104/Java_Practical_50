//Lab-5 Assignment-4
import java.io.*;

public class LogSummary {
    public static void main(String[] args) {
        String inputFile = "app.log";
        String outputFile = "log_summary.txt";

        int infoCount = 0;
        int warnCount = 0;
        int errorCount = 0;

        // Step 1: Read the log file and count messages
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("INFO")) {
                    infoCount++;
                } else if (line.startsWith("WARN")) {
                    warnCount++;
                } else if (line.startsWith("ERROR")) {
                    errorCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Step 2: Write the summary to a new file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Log File Summary Report");
            writer.newLine();
            writer.write("-----------------------");
            writer.newLine();
            writer.write("INFO messages: " + infoCount);
            writer.newLine();
            writer.write("WARN messages: " + warnCount);
            writer.newLine();
            writer.write("ERROR messages: " + errorCount);
            writer.newLine();

            System.out.println("Summary written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }
}
