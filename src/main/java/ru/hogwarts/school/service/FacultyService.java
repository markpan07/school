package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
        if(faculties.containsKey(id)) {
            return faculties.get(id);
        }
        return null;
    }

    public Faculty updateFaculty(Faculty faculty) {
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty deleteFaculty(long id) {
        if(faculties.containsKey(id)) {
            return faculties.remove(id);
        }
        return null;
    }

    public List<Faculty> filterByColor(String color) {
        return faculties.values().stream()
                .filter(f -> f.getColor().equals(color))
                .collect(Collectors.toList());
    }

}
