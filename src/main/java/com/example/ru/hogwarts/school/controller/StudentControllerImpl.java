package com.example.ru.hogwarts.school.controller;

import com.example.ru.hogwarts.school.model.Student;
import com.example.ru.hogwarts.school.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentControllerImpl implements StudentController{
    private final StudentService studentService;

    public StudentControllerImpl(StudentService studentService) {
        this.studentService = studentService;
    }
    @Override
    @GetMapping("{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.findStudent(id);
    }

    @Override
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @Override
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.editStudent(student);
    }
    @Override
    @DeleteMapping("{id}")
    public Student deleteStudent(@PathVariable long id) {
        return studentService.deleteStudent(id);
    }
    @Override

    @GetMapping("/sorted/{age}")
    public Collection<Student> getStudentByAge(@PathVariable int age) {
        return studentService.findStudentByAge(age);
    }
}
