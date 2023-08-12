package ru.hogwarts.school.model;

import javax.persistence.*;

@Entity
@Table(name = "faculties")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String color;

    public Faculty() {
    }

    public Faculty(long id, String name, String color) {
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

    public String getColor() {
        return color;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
