package com.example.ru.hogwarts.school.service;

import com.example.ru.hogwarts.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    Map<Long, Student> students = new HashMap<>();
    private long lastId = 0;

    @Override
    public Student createStudent(Student student) {
        student.setId(++lastId);
        students.put(lastId, student);
        return student;
    }

    @Override
    public Student findStudent(long id) {
        return students.get(id);
    }

    @Override
    public Student editStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public Student deleteStudent(long id) {
        return students.remove(id);
    }

    @Override
    public Collection<Student> findStudentByAge(int age) {
        Collection<Student> studentList = new ArrayList<>();
        for (Map.Entry<Long, Student> student : students.entrySet()) {
            if (student.getValue().getAge() == age) {
                studentList.add(student.getValue());
            }
        } return studentList;
    }
}
