import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("===== Notes App =====");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Write a new note (Overwrite)");
            System.out.println("2. Append a note");
            System.out.println("3. View notes");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> writeNotes(false);
                case 2 -> writeNotes(true);
                case 3 -> readNotes();
                case 4 -> {
                    System.out.println("Exiting Notes App. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Write notes to file
    private static void writeNotes(boolean append) {
        System.out.println("Enter your note (type 'END' on a new line to finish):");
        StringBuilder content = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            content.append(line).append(System.lineSeparator());
        }

        try (FileWriter writer = new FileWriter(FILE_NAME, append)) {
            writer.write(content.toString());
            System.out.println("Notes saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read notes from file
    private static void readNotes() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No notes found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n===== Your Notes =====");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("======================");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
