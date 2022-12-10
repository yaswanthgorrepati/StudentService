package com.yaswanth.StudentService.controller;

import com.yaswanth.StudentService.HealthStatus;
import com.yaswanth.StudentService.ResponseMessage;
import com.yaswanth.StudentService.entity.Student;
import com.yaswanth.StudentService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/healthCheck")
    public HealthStatus getHealthStatus(){
        return new HealthStatus("Healthy", "1.0");
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String studentId){
        Long id = Long.parseLong(studentId);
        return studentService.getStudentById(id);
    }

    @PostMapping("")
    public ResponseMessage createStudent(@RequestBody Student student){
        Student student1 = studentService.createStudent(student);
        return new ResponseMessage("Successfully created Studeent", "00", String.valueOf(student1.getId()));
    }
}
