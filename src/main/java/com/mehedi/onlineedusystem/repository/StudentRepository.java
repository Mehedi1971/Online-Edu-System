package com.mehedi.onlineedusystem.repository;

import com.mehedi.onlineedusystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findAllByActiveStatus(Integer status);
}
