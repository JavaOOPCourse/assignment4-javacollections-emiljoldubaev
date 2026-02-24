package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        Student emil = new Student(12,"emil",3.4);
        Student islam = new Student(13,"islam",3.9);
        Student begi = new Student(14,"begimai",4.00);
        Student ibo = new Student(15,"ibrahim",4.00);
        Student bars = new Student(16,"barsbek",4.00);
        students.add(emil);
        students.add(islam);
        students.add(begi);
        students.add(ibo);
        students.add(bars);

    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getGpa() < 2.0) {
                it.remove();
            }
        }
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        double negativeInfinityDouble = Double.NEGATIVE_INFINITY;
        String name = "";
        for(Student student : students){
            if(student.getGpa() > negativeInfinityDouble){
                negativeInfinityDouble = student.getGpa();
                name = student.getName();
            }
        }
        System.out.println("Name: " + name + ",gpa: " + negativeInfinityDouble);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        Student era = new Student(17,"erzhan",4.00);
        if(!students.isEmpty() && students.size() >= 2){
            students.add(2,era);;
            System.out.println("the student was added to 2nd index");
        } else {
            System.out.println("the list is empty");
        }
    }

    public void printStudents() {
        // TODO: Print using Iterator
        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
