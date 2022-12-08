package com.yaswanth.StudentService.controller;

import com.yaswanth.StudentService.HealthStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/healthCheck")
    public HealthStatus getHealthStatus(){
        return new HealthStatus("Healthy", "1.0");
    }
}
