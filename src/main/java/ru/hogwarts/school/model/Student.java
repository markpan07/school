package ru.hogwarts.school.model;

public class Student {

    private long id;
    private String name;
    private int age;

    public Student(long id, String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
