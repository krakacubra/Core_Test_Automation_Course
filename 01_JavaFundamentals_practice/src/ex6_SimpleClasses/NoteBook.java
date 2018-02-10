package ex6_SimpleClasses;

import java.lang.System;

/**
 * class Notebook consists notes with class Note
 */
public class NoteBook {
    private Note []notes;
    private int count = 0;
    public int getCount(){
        return count;
    }
    public Note[] getNote(){
        return notes;
    }

    /**
     * Method adds note to the specified index in array
     * @param n Place where note must be added
     * @param newNote New note in notebook
     */
    public void addNote(int n, String newNote) {
        if(n == 0){
            this.addNoteToBeg(newNote);
        }
        else if(n < 0 || n > this.count){
            System.out.print("wrong position");
        }
        else if (n == this.count){
            this.addNoteToBack(newNote);
        }
        else{
            if (this.count < this.notes.length){
                System.arraycopy(this.notes, n, this.notes, n + 1, this.count - n);
                this.notes[n] = new Note(newNote);
            }

            else{
                Note[] newNotes = new Note[this.notes.length * 2];
                System.arraycopy(this.notes, 0, newNotes, 0, n);
                newNotes[n] = new Note(newNote);
                System.arraycopy(this.notes, n, newNotes, n + 1, this.count - n);
                this.notes = newNotes;
            }
            this.count++;
        }
    }

    /**
     * Method adds note to the specified index in array
     * @param n Place where note must be added
     * @param newNote New note in notebook
     */
    public void addNote(int n, Note newNote){
        if(n == 0){
            this.addNoteToBeg(newNote);
        }
        else if(n < 0 || n > this.count){
            System.out.print("wrong position");
        }
        else if (n == this.count){
            this.addNoteToBack(newNote);
        }
        else{
            if (this.count < this.notes.length){
                System.arraycopy(this.notes, n, this.notes, n + 1, this.count - n);
                this.notes[n] = newNote;
            }

            else{
                Note[] newNotes = new Note[this.notes.length * 2];
                System.arraycopy(this.notes, 0, newNotes, 0, n);
                newNotes[n] = newNote;
                System.arraycopy(this.notes, n, newNotes, n + 1, this.count - n);
                this.notes = newNotes;
            }
            this.count++;
        }
    }

    /**
     * Method deletes note in the specified index
     * @param n Index of the note which must be deleted
     */
    public void delNote(int n){ // delete note number n
        if(n >= this.count){
            System.out.print("There is no such element in notebook");
            return;
        }
        if(this.count * 2 < this.notes.length){
            Note newNotes[] = new Note[this.notes.length / 2];
            System.arraycopy(this.notes, 0, newNotes, 0, n);
            System.arraycopy(this.notes,n + 1, newNotes, n, this.count - n);
            this.notes = newNotes;
        }
        else {
            System.arraycopy(this.notes, n + 1, this.notes, n, this.count - n);
        }
        this.count--;
    }

    /**
     * Method print all the notes in the notebook
     */
    public void watchNotes(){
        System.out.print("\nAll notes: \n");
        for (int i = 0; i < this.count; i++){
            System.out.print(this.notes[i].getNote() + " ");
        }
    }

    /**
     * Method updates note in specified place with the given updateNote
     * @param n index in the array
     * @param updateNote new note value at the index n
     */
    public void updateNote(int n, Note updateNote){
        if(n < 0 || n >= this.count){
            System.out.print("Notebook hasn't note with this index");
        }
        else{
            this.notes[n] = updateNote;
        }
    }

    NoteBook(){
        this.notes = new Note[1];
    }
    NoteBook(int n){
        if (n == 0){
            this.notes = new Note[1];
        }
        this.notes = new Note[n];
    }

    private void addNoteToBack(String newNote){
        if(newNote == null) {
            System.out.print("there is no new note!");
            return;
        }
        if (this.count < this.notes.length){
            this.notes[this.count] = new Note(newNote);
        }
        else{
            Note[] newNotes = new Note[this.notes.length * 2];
            System.arraycopy(this.notes, 0, newNotes, 0, this.count);
            newNotes[this.count] = new Note(newNote);
            this.notes = newNotes;
        }
        this.count ++;
    }
    private void addNoteToBack(Note newNote){
        if(newNote == null) {
            System.out.print("there is no new note!");
            return;
        }
        if (this.count < this.notes.length){
            this.notes[this.count] = newNote;

        }
        else{
            Note[] newNotes = new Note[this.notes.length * 2];
            System.arraycopy(this.notes, 0, newNotes, 0, this.count);
            newNotes[this.count] = newNote;
            this.notes = newNotes;
        }

        this.count++;
    }
    private void addNoteToBeg(Note newNote){
        if(newNote == null) {
            System.out.print("there is no new note!");
            return;
        }

        if (this.count < this.notes.length){
            System.arraycopy(this.notes, 0, this.notes, 1, this.count);
            this.notes[0] = newNote;
        }

        else{
            Note[] newNotes = new Note[this.notes.length * 2];
            newNotes[0] = newNote;
            System.arraycopy(this.notes, 0, newNotes, 1, this.count);
            this.notes = newNotes;
        }
        this.count++;
    }
    private void addNoteToBeg(String newNote){
        if(newNote == null) {
            System.out.print("there is no new note!");
            return;
        }

        if (this.count < this.notes.length){
            System.arraycopy(this.notes, 0, this.notes, 1, this.count);
            Note record = new Note(newNote);
            this.notes[0] = record;

        }

        else{
            Note[] newNotes = new Note[this.notes.length * 2];
            Note record = new Note(newNote);
            newNotes[0] = record;
            System.arraycopy(this.notes, 0, newNotes, 1, this.count);
            this.notes = newNotes;
        }
        this.count++;
    }

}