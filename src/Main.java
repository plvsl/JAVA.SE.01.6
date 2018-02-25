public class Main {
    
    public static void main(String[] args) {
        /* Test */

        System.out.println("For empty constructor:");
        System.out.println("-----");

        NotePad notepad = new NotePad();

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
        System.out.println("-----");
        System.out.println("Edit");System.out.println("-----");
        notepad.removeNote(0);
        notepad.editNote(1, new Note("NewNote!"));
        notepad.editNote(-4, new Note("NewNote!"));
        notepad.showAllNotes();

        System.out.println("**********************************************");
        System.out.println("For constructor with customer size of notepad: ");
        System.out.println("-----");

       NotePad notepad2 = new NotePad(2);

        notepad2.addNote(new Note("note2_1"));
        notepad2.addNote(new Note("note2_2"));
        notepad2.addNote(new Note("note2_3"));
        notepad2.addNote(new Note("note2_4"));
        notepad2.addNote(new Note("note2_5"));
        notepad2.addNote(new Note("note2_6"));
        notepad2.addNote(new Note("note2_7"));
        notepad2.addNote(new Note("note2_8"));
        notepad2.addNote(new Note("note2_9"));
        notepad2.addNote(new Note("note2_10"));
        notepad2.addNote(new Note("note2_11"));
        notepad2.showAllNotes();
        System.out.println("-----");
        System.out.println("Edit");System.out.println("-----");
        notepad2.removeNote(0);
        notepad2.editNote(34, new Note("NewNote!"));
        notepad2.showAllNotes();

        System.out.println("**********************************************");

        notepad2.removeNote(0);
        System.out.println(notepad2.getNotePadSize());
        notepad2.removeNote(0);
        System.out.println(notepad2.getNotePadSize());
        notepad2.removeNote(0);
        System.out.println(notepad2.getNotePadSize());

        System.out.println("**********************************************");
        NotePad notepad3 = new NotePad(700);
        notepad3.showAllNotes();
        System.out.println(notepad3.getNotePadSize());
        notepad3.addNote(new Note("checking"));
        notepad3.addNote(new Note("checking2"));
        notepad3.showAllNotes();
        System.out.println(notepad3.getNotePadSize());
        notepad3.removeNote(0);
        notepad3.showAllNotes();
        System.out.println(notepad3.getNotePadSize());

    }
}
