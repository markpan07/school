package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;

@Service
public class FacultyService {

    private static long counterId = 1;

    HashMap<Long, Faculty> faculties = new HashMap<>();

    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(counterId);
        faculties.put(counterId, faculty);
        counterId++;
        return faculty;
    }

    public Faculty getFaculty(long id) {
        return faculties.get(id);
    }

    public Faculty updateFaculty(long id, Faculty faculty) {
        faculties.put(id, faculty);
        return faculty;
    }

    public Faculty deleteFaculty(long id) {
        return faculties.remove(id);
    }

}
