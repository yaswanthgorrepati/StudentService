package com.yaswanth.StudentService.dao;

import com.yaswanth.StudentService.entity.Student;

public interface StudentDAO {

     Student getStudentById(Long id);

     Student createStudent(Student student);

}
