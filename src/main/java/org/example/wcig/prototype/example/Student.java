package org.example.wcig.prototype.example;

public class Student implements Cloneable {
    private int id;
    private String name;

    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Object clone() {
        return new Student(this.id, this.name);
    }

    public Student copy() {
        return new Student(this.id, this.name);
    }
}
