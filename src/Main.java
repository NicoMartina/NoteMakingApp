import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteList noteList = new NoteList();

        boolean running = true;
        while (running) {

            System.out.println("Welcome to your Note Taking App");
            System.out.println("What would you like to do?");
            System.out.println("1. Make a note");
            System.out.println("2. Remove a note");
            System.out.println("3. Display all notes");
            System.out.println("4. Exit");
            System.out.println("Choose you're option:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String addTitle = scanner.nextLine();
                    System.out.print("Body: ");
                    String addBody = scanner.nextLine();

                    Note note = new Note(addTitle, addBody);
                    noteList.addNote(note);
                    System.out.println("✅ Note added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the title of the note to remove: ");
                    String removeNote = scanner.nextLine();
                    noteList.removeNote(removeNote);
                    System.out.println("✅ Note deleted successfully!");
                    break;
                case 3:
                    noteList.displayNotes();
                    break;
                case 4:
                    System.out.println("👋 Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("⚠️ Invalid option. Please try again.");
            }
        }
        scanner.close();

    }
}