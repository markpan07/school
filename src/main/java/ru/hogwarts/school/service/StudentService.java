package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;

@Service
public class StudentService {

    private static long counterId = 1;

    HashMap<Long, Student> students = new HashMap<>();

    public Student createStudent(String name, int age) {
       Student student = new Student(counterId, name, age);
       students.put(counterId, student);
       counterId++;
        return student;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public Student updateStudent(long id, Student student) {
        students.put(id, student);
        return student;
    }

    public Student deleteStudent(long id) {
        return students.remove(id);
    }

}
