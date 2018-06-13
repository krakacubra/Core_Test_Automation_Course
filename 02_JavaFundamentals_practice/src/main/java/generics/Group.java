package main.java.generics;

import main.java.generics.exception.NoSuchStudentException;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Group<T extends Number> {
    private SubjectsLabels subject;
    private List<Student> students;
    private Map<Student, Mark<T>> journal = new HashMap<>();

    public Group(){

    }
    public Group(SubjectsLabels subject, List<Student> students){
        this.subject = subject;
        this.students = students;
    }

    public SubjectsLabels getSubject() {
        return subject;
    }

    public void setSubject(SubjectsLabels subject) {
        this.subject = subject;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void setMarkForStudent(Student st, T mark) throws NoSuchStudentException{
        if (!students.contains(st)){
            throw new NoSuchStudentException();
        }
        journal.put(st,new Mark<>(mark));
    }

    public Map<Student, Mark<T>> getJournal(){
        return journal;
    }
    public static class Mark<T extends Number> {
        T mark;

        public Mark(){

        }
        public Mark(T mark){
            this.mark = mark;
        }
        public void setMarks(T mark) {
            this.mark = mark;
        }

        public int max(List<Number> marks){
            Number max = -1000000.;
            int index = -1;
            for (int i = 0; i < marks.size(); i++){
                if(marks.get(i).doubleValue() > max.doubleValue()){
                    max = marks.get(i).doubleValue();
                    index = i;
                }
            }
            return index;
        }
    }

    public class MarkComparator implements Comparator<T> {
        @Override
        public int compare(T o1, T o2) {
            if (o1.doubleValue() > o2.doubleValue()){
                return 1;
            }
            return o1.doubleValue() < o2.doubleValue() ? -1 : 0;
        }

    }

}
