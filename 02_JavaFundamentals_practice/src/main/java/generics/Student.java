package main.java.generics;

import java.util.*;

public class Student {
    private int id;
    private Map<SubjectsLabels, Group.Mark> dairy = new LinkedHashMap<>();

    public Student(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<SubjectsLabels, Group.Mark> getDairy(){
        return dairy;
    }

    public void allStudentSubjects(List<Group> groups){
        for(Group group : groups){
            if (group.getStudents().indexOf(new Student(id)) > 0){
                dairy.put(
                        group.getSubject(),
                        (Group.Mark) group.getJournal().get(new Student(id))
                );
            }
        }
    }

    public SubjectsLabels bestSubject(){
        List<Group.Mark> marks = new LinkedList<>(dairy.values());
        Group.Mark mark;
        mark = new Group.Mark();
        int index = mark.max(marks);
        Set<SubjectsLabels> set = new LinkedHashSet<>(dairy.keySet());
        Iterator<SubjectsLabels> setIterator = set.iterator();
        SubjectsLabels label = SubjectsLabels.ALGORITHMS;
        int i = 0;
        while (i<=index){
            label = setIterator.next();
        }
        return label;
    }
}
