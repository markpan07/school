package ru.hogwarts.school.model;

public class Student {

    private long id;
    private String name;
    private String color;

    public Student(long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
