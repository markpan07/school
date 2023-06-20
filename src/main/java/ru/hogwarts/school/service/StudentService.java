package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private static long counterId = 1;

    HashMap<Long, Student> students = new HashMap<>();

    public Student createStudent(Student student) {
        student.setId(counterId);
        students.put(counterId, student);
        counterId++;
        return student;
    }

    public Student getStudent(long id) {
        if (students.containsKey(id)) {
            return students.get(id);

        }
        return null;
    }

    public Student updateStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public Student deleteStudent(long id) {
        if (students.containsKey(id)) {
            return students.remove(id);
        }
        return null;
    }

    public List<Student> filterByAge (int age) {
        return students.values().stream()
                .filter(f -> f.getAge() == age)
                .collect(Collectors.toList());
    }
}
