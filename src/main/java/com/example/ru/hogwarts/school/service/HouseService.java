package com.example.ru.hogwarts.school.service;

import com.example.ru.hogwarts.school.model.Faculty;

import java.util.List;

public interface HouseService {
    Faculty createFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    Faculty editFaculty(Faculty faculty);

    Faculty deleteFaculty(long id);

    List<Faculty> findFacultyByColor(String color);
}
