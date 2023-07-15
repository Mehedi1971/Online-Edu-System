package com.mehedi.onlineedusystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto extends BaseDto {
    private String studentName;
    private String studentRoll;
    private List<CourseDto> courses;
}
