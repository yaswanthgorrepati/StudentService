package com.yaswanth.StudentService.service;

import com.yaswanth.StudentService.entity.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
     Student getStudentById(Long id);
     Student createStudent(Student student);
}
