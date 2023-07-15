package com.mehedi.onlineedusystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeacherDto extends BaseDto {
    private String teacherName;
    private String teacherDesignation;
    private List<StudentDto> students;
}
