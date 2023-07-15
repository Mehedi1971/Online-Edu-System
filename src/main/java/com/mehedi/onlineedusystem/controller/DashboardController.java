package com.mehedi.onlineedusystem.controller;

import com.mehedi.onlineedusystem.dto.DashboardDto;
import com.mehedi.onlineedusystem.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/public")
public class DashboardController {
    private final DashboardService dashboardService;

    @GetMapping("/dashboard")
    public DashboardDto getDashboardData(){
        return dashboardService.getDashboardData();
    }
}
