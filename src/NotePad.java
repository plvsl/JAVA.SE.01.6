import java.util.Arrays;

public class NotePad {

    private static final int standardSize = 10;
    private int notePadSize;
    private Note notes[];

    public NotePad(int customerSize){
        notePadSize = customerSize;
        notes = new Note[notePadSize];
    }

    public  NotePad(){
        notePadSize = standardSize;
        notes = new Note[notePadSize];
    }

    /*@Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
        //return (this.notePadSize == ((NotePad)obj).notePadSize);
    }*/

    /**
     * The addNote program implements an application that adds a new Note to the NotePad.
     * It checks the array of notes and looks for empty cells (null),
     * where it writes a new note. If all cells are occupied, it calles the method copyOf()
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
        notePadSize = notes.length - 1;
        Note temp [] = new Note[notePadSize];
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
        if (index < notes.length && index >= 0) {
            if (newNote != null) {
                notes[index] = newNote;
            }
        }
        else {
            System.out.println("Incorrect index for edit note! Enter the right value of index.");
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
                System.out.println(note.getNote());
            }
        }
        System.out.println();
    }

    public int getNotePadSize() {
        return notePadSize;
    }
}