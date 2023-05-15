package com.example.ru.hogwarts.school.service;

import com.example.ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    Student findStudent(long id);

    Student editStudent(Student student);

    Student deleteStudent(long id);

    Collection<Student> findStudentByAge(int age);
}
