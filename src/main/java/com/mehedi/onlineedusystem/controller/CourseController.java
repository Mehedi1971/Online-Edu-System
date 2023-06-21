package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.model.Course;
import com.mehedi.onlineedusystem.model.Profile;
import com.mehedi.onlineedusystem.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {
    private final CourseRepository courseRepository;

    @PostMapping("/course")
    public Course saveAll(@RequestBody Course course){
        return courseRepository.save(course);
    }

    @GetMapping("/course")
    public List<Course> getAll(){
        return courseRepository.findAll();
    }

}
