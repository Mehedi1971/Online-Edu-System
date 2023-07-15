package com.mehedi.onlineedusystem.repository;

import com.mehedi.onlineedusystem.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    List<Teacher>findAllByActiveStatus(int status);
}
