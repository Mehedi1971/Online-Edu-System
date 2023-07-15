package com.mehedi.onlineedusystem.service.Impl;

import com.mehedi.onlineedusystem.dto.CourseDto;
import com.mehedi.onlineedusystem.model.Course;
import com.mehedi.onlineedusystem.repository.CourseRepository;
import com.mehedi.onlineedusystem.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;


    @Override
    public CourseDto savecourse(CourseDto courseDto) {
        Course course=modelMapper.map(courseDto,Course.class);

        Course savedCourse=courseRepository.save(course);

        CourseDto savedCourseDto=modelMapper.map(savedCourse, CourseDto.class);
        return savedCourseDto;
    }

    @Override
    public List<CourseDto> getAllCourse() {
        return courseRepository.findAll()
                .stream()
                .map((course)->modelMapper.map(course,CourseDto.class))
                .collect(Collectors.toList());
    }

}
