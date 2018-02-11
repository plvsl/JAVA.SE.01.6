import java.util.Arrays;

public class NotePad {

    private int notePadSize = 10;
    private Note notes [] = new Note[notePadSize];

    /**
     * The addNote program implements an application that adds a new Note to the NotePad.
     * It checks the array of notes and looks for empty cells (null),
     * where it writes a new note. If all cells are occupied, it called the method copyOf
     * which allows you to copy the array, add  5 more empty cells to it and write your
     * notetoAdd to the notes array
     * @param noteToAdd Note that you want to add to the notePad
     * @author  Vasileva Polina
     * @version 1.0
     * @since   2018-02-11
     */

    void addNote(Note noteToAdd){
        boolean marker = false;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = noteToAdd;
                marker = true;
                break;
            }
        }
        if (!marker) {
            notes = Arrays.copyOf(notes, notePadSize + 5);
            notes[notePadSize] = noteToAdd;
            notePadSize = notePadSize + 5;
        }
    }

    /**
     * removeNote program implements an application that deletes specific Note from the array of notes.
     * It uses the System.arraycopy() method, which copy an array from the specified source array,
     * beginning at the specified position, to the specified position of the destination array.
     * @param index Index of note that needed to be deleted.
     * @author  Vasileva Polina
     * @version 1.0
     * @since   2018-02-11
     */

    void removeNote(int index){
        Note temp [] = new Note[notes.length];
        System.arraycopy(notes, 0, temp, 0, index);
        System.arraycopy(notes, index + 1, temp, index, notes.length - index - 1);
        notes = temp;
    }

    /**
     * editNote program implements an application that allows to rewrite an existing note to another.
     * @param index Index of note that needed to be edit.
     * @param newNote New note that will be recorded in the specific index.
     * @author  Vasileva Polina
     * @version 1.0
     * @since   2018-02-11
     */

    void editNote(int index, Note newNote){
        if (newNote != null) {
            notes[index] = newNote;
        }
    }

    /**
     * showAllNotes program implements an application that print all your Notes of the NotePad to the console.
     * @author  Vasileva Polina
     * @version 1.0
     * @since   2018-02-11
     */

    void showAllNotes() {
        for (Note note : notes) {
            if (note != null) {
                System.out.println(note.note);
            }
        }
        System.out.println();
    }
}