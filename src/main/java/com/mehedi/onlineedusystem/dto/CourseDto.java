package com.mehedi.onlineedusystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class CourseDto extends BaseDto {
    private String courseName;
    private long courseCredit;
    private List<TeacherDto> teachers;
}
