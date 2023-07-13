package com.mehedi.onlineedusystem.service;

import com.mehedi.onlineedusystem.model.Course;

import java.util.List;

public interface CourseService {
    Course savecourse(Course course);

    List<Course> getAllCourse();
}
