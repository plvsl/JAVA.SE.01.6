public class Main {
    
    public static void main(String[] args) {
        NotePad notepad = new NotePad();
        /* Testing methods */
        notepad.showAllNotes();
        notepad.addNote(new Note("note1"));
        notepad.addNote(new Note("note2"));
        notepad.addNote(new Note("note3"));
        notepad.addNote(new Note("note4"));
        notepad.addNote(new Note("note5"));
        notepad.addNote(new Note("note6"));
        notepad.addNote(new Note("note7"));
        notepad.addNote(new Note("note8"));
        notepad.addNote(new Note("note9"));
        notepad.addNote(new Note("note10"));
        notepad.addNote(new Note("note11"));
        notepad.showAllNotes();
        notepad.removeNote(2);
        notepad.showAllNotes();
    }
}
