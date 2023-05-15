package com.example.ru.hogwarts.school.controller;

import com.example.ru.hogwarts.school.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

public interface StudentController {
    @GetMapping("{id}")
    Student getStudent(@PathVariable long id);

    @PostMapping
    Student createStudent(Student student);

    @PutMapping
    Student updateStudent(Student student);

    @DeleteMapping("{id}")
    Student deleteStudent(@PathVariable long id);

    @GetMapping("{age}")
    Collection<Student> getStudentByAge(@PathVariable int age);
}
