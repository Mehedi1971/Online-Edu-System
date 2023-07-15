package com.mehedi.onlineedusystem.service.Impl;

import com.mehedi.onlineedusystem.dto.DashboardDto;
import com.mehedi.onlineedusystem.enums.ActiveStatus;
import com.mehedi.onlineedusystem.repository.StudentRepository;
import com.mehedi.onlineedusystem.repository.TeacherRepository;
import com.mehedi.onlineedusystem.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    public DashboardDto getDashboardData(){
        DashboardDto dashboardDto=new DashboardDto();
        dashboardDto.setAllStudent( studentRepository.findAllByActiveStatus(ActiveStatus.ACTIVE.getValue()).size());
        dashboardDto.setAllTeacher( teacherRepository.findAllByActiveStatus(ActiveStatus.ACTIVE.getValue()).size());
        return dashboardDto;
    }
}
