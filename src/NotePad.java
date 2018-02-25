import java.util.Arrays;

public class NotePad {

    private static final int standardSize = 10;
    private static final double expansionCoeff = 1.5;
    private Note notes[];
    private int actualSize = 0;

    public NotePad(int customSize){
        notes = new Note[customSize];
    }

    public  NotePad(){
        notes = new Note[standardSize];
    }
    
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
            Note temp [] = Arrays.copyOf(notes, (int) (notes.length * expansionCoeff));
            temp[notes.length] = noteToAdd;
            notes = temp;
        }
        actualSize++;
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
        if (checkElement(index)) {
            Note temp [] = new Note[notes.length - 1];
            System.arraycopy(notes, 0, temp, 0, index);
            System.arraycopy(notes, index + 1, temp, index, notes.length - index - 1);
            notes = temp;

            if (notes.length > actualSize * expansionCoeff) {
                temp = new Note[(int) (actualSize * expansionCoeff)];
                System.arraycopy(notes, 0, temp, 0, actualSize);
                notes = temp;
            }
        }
        else {
            System.out.println("Incorrect index for remove note! Enter right value of index.");
        }

        actualSize--;
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
        if (checkElement(index)) {
            if (newNote != null) {
                notes[index] = newNote;
            }
        }
        else {
            System.out.println("Incorrect index for edit note! Enter right value of index.");
        }
    }

    /**
     * showAllNotes program implements an application that print all your Notes of the NotePad to the console.
     * @author  Vasileva Polina
     * @version 1.0
     * @since   2018-02-11
     */

    private boolean checkElement(int index) {
        return index < notes.length && index >= 0;
    }

    void showAllNotes() {
        for (Note note : notes) {
            if (note != null) {
                System.out.println(note.getNote());
            }
        }
        System.out.println();
    }

    public int getNotePadSize() {
        return notes.length;
    }
}