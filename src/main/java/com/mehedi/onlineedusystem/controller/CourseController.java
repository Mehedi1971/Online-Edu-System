package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.dto.CourseDto;
import com.mehedi.onlineedusystem.dto.DashboardDto;
import com.mehedi.onlineedusystem.model.Course;
import com.mehedi.onlineedusystem.service.CourseService;
import com.mehedi.onlineedusystem.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;


    @PostMapping("/save-course")
    public CourseDto saveAll(@RequestBody CourseDto courseDto){
        return courseService.savecourse(courseDto);
    }

    @GetMapping("/all-courses")
    public List<CourseDto> getAll(){
        return courseService.getAllCourse();
    }


}
