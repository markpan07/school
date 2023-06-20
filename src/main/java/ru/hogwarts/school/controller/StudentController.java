package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable Long studentId){
       Student student = studentService.getStudent(studentId);
       if (student == null) {
           return ResponseEntity.notFound().build();
       }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.ok(createdStudent);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable long id) {
        Student student = studentService.deleteStudent(id);
        if (student == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);

    }

}