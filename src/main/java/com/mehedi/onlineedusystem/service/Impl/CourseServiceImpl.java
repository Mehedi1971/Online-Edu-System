package com.mehedi.onlineedusystem.service.Impl;

import com.mehedi.onlineedusystem.model.Course;
import com.mehedi.onlineedusystem.repository.CourseRepository;
import com.mehedi.onlineedusystem.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;


    @Override
    public Course savecourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
}
