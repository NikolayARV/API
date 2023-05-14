package com.example.ru.hogwarts.school.service;

import com.example.ru.hogwarts.school.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class HouseServiceImpl implements HouseService {
    Map<Long, Faculty> houseMap = new HashMap<>();
    private long lastId = 0;
    @Override
    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(++lastId);
        houseMap.put(lastId, faculty);
        return faculty;
    }

    @Override
    public Faculty findFaculty(long id) {
        return houseMap.get(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        houseMap.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty deleteFaculty(long id) {
        return houseMap.remove(id);
    }
    @Override
    public List<Faculty> findFacultyByColor(String color) {
        List<Faculty> facultiesList = new ArrayList<>();
        for (Map.Entry<Long, Faculty> faculty : houseMap.entrySet()) {
            if (faculty.getValue().getColor().equals(color)) {
                facultiesList.add(faculty.getValue());
            }
        } return facultiesList;
    }
}
