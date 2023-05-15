package com.example.ru.hogwarts.school.controller;

import com.example.ru.hogwarts.school.model.Faculty;
import com.example.ru.hogwarts.school.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface HouseController {

    @GetMapping("{id}")
    Faculty getFaculty(@PathVariable long id);

    @PostMapping
    Faculty createFaculty(Faculty faculty);

    @PutMapping
    Faculty updateFaculty(Faculty faculty);

    @DeleteMapping("{id}")
    Faculty deleteFaculty(@PathVariable long id);

    @GetMapping("{color}")
   List<Faculty> getFacultyByColor(@PathVariable String color);
}
