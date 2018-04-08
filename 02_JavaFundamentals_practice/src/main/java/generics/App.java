package main.java.generics;

import main.java.generics.exception.NoSuchStudentException;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> firstList= new LinkedList<>();
        Student one = new Student(1);
        Student two = new Student(2);
        Student three = new Student(3);
        firstList.add(one);
        firstList.add(two);
        Group<Integer> first = new Group<>(
                SubjectsLabels.ALGORITHMS,
                firstList
        );
        List<Student> secondList = new LinkedList<>();
        secondList.add(one);
        secondList.add(three);
        Group<Double> second = new Group<>(
                SubjectsLabels.ENGLISH,
                secondList
        );
         try{
             first.setMarkForStudent(one, 4);
             first.setMarkForStudent(two,5);
             second.setMarkForStudent(one,1.7);
             second.setMarkForStudent(three,2.5);
         } catch (NoSuchStudentException e){
             e.printStackTrace();
         }
        List<Group> groups = new LinkedList<>();
         groups.add(first);
         groups.add(second);
         one.allStudentSubjects(groups);
         System.out.println("Best subject one student has is " + one.bestSubject());
    }
}
