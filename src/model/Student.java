package model;

public class Student {

    // TODO: declare fields
    private int id;
    private String name;
    private double gpa;

    // TODO: create constructor
    public Student(int id,String name,double gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
    // TODO: create getters

    // TODO: override toString()
    @Override
    public String toString() {
        return "name: " + name + ", id: " + id + ", gpa: " + gpa;
    }
}

