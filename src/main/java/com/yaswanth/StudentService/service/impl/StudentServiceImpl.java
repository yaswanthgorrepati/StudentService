package com.yaswanth.StudentService.service.impl;

import com.yaswanth.StudentService.dao.StudentDAO;
import com.yaswanth.StudentService.entity.Student;
import com.yaswanth.StudentService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Student getStudentById(Long id) {
        if(id == null){
            return null;
        }
        Student student = studentDAO.getStudentById(id);
        return student;
    }

    @Override
    @Transactional
    public Student createStudent(Student student) {
        return studentDAO.createStudent(student);
    }
}
