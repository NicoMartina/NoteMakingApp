import java.util.ArrayList;
import java.util.List;

public class NoteList {
    private List<Note> notes; //we set the List

    //constructor
    public NoteList(){
        notes = new ArrayList<>(); // we assign the list to an ArrayList
    }

    public void addNote(Note note){
        notes.add(note);
    }

    public void removeNote(String title){
        boolean removed = false;
        for (int i = 0; i < notes.size(); i ++){
            if (notes.get(i).getTitle().equalsIgnoreCase(title)) {
                notes.remove(i);
                removed = true;

                break;
            }
        }
        if (!removed) {
            System.out.println("No note found with that title.");
        }
    }

    public void displayNotes(){
        if (notes.isEmpty())   {
            System.out.println("No notes to display.");
        }
        for (Note note : notes) {
            System.out.println(note);
            System.out.println("-----------------");
        }

    }
}
