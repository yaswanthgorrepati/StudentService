package com.yaswanth.StudentService.dao.impl;

import com.yaswanth.StudentService.dao.StudentDAO;
import com.yaswanth.StudentService.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {


    @Autowired
    private EntityManager em;

    @Override
    public Student getStudentById(Long id) {
        TypedQuery<Student> typedQuery = em.createNamedQuery("fetchStudentById", Student.class);
        typedQuery.setParameter("studentId", id);
        List<Student> studentList = typedQuery.getResultList();
        if(!CollectionUtils.isEmpty(studentList)){
            return studentList.get(0);
        }
        return null;
    }

    @Override
    public Student createStudent(Student student){
        em.persist(student);
        return student;
    }
}
