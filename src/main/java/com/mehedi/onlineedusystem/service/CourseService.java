package com.mehedi.onlineedusystem.service;

import com.mehedi.onlineedusystem.dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto savecourse(CourseDto courseDto);

    List<CourseDto> getAllCourse();


}
