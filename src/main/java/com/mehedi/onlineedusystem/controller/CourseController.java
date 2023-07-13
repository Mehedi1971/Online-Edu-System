package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.model.Course;
import com.mehedi.onlineedusystem.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/save-course")
    public Course saveAll(@RequestBody Course course){
        return courseService.savecourse(course);
    }

    @GetMapping("/all-courses")
    public List<Course> getAll(){
        return courseService.getAllCourse();
    }

}
